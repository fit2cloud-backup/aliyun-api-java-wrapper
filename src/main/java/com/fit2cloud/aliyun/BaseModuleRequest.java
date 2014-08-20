package com.fit2cloud.aliyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SimpleTimeZone;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.ErrorResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseModuleRequest {

    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String ENCODING = "UTF-8";
    private static final String RESPONSE_FORMAT = "JSON";
    private static final Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    private URI endpoint;
    private String httpMethod = "GET";
    private String apiVersion;

    private AliyunCredentials credentials;

    public BaseModuleRequest(AliyunCredentials credentials, String endpoint, String apiVersion) {
        this.credentials = credentials;
        this.endpoint = URI.create(endpoint);
        this.apiVersion = apiVersion;
    }

    public String execute(String action, Map<String, String> parameters) throws AliyunClientException, AliyunServiceException {
        assert(action != null && action.length() > 0);
        if (parameters == null) {
            parameters = new HashMap<String, String>();
        }
        addCommonParams(action, parameters);
        return sendRequest(parameters);
    }
    
    private String sendRequest(Map<String, String> parameters) throws AliyunClientException, AliyunServiceException  {
        InputStream content = null;
        HttpURLConnection connection  = null;
        try {
        	String query = paramsToQueryString(parameters);
        	URL url = new URL(endpoint.toString() + "?" + query);
        	connection = (HttpURLConnection)url.openConnection();
        	connection.connect();
        	int code = connection.getResponseCode();
        	if (code>=400){
        	  	content = connection.getErrorStream();
            	String message = readContent(content);
        		ErrorResponse error = gson.fromJson(message, ErrorResponse.class);
        		AliyunServiceException exception =  new AliyunServiceException(error.getMessage());
        		exception.setStatusCode(code);
        		exception.setRequestId(error.getRequestId());
        		exception.setServiceName(error.getHostId());
        		exception.setErrorCode(error.getCode());
        		throw exception;
        	}else{
        	   	content = connection.getInputStream();
            	String message = readContent(content);
            	return message;
        	}
        } catch (IOException e) {
            throw new AliyunClientException("Failed to connect to Aliyun:" + e.getMessage());
        } finally {
            safeClose(content);
            connection.disconnect();
        }
    }

    private void addCommonParams(String action, Map<String, String> parameters) {
        parameters.put("Action", action);
        parameters.put("Version", apiVersion);
        parameters.put("AccessKeyId", credentials.getAccessKeyId());
        parameters.put("TimeStamp", formatIso8601Date(new Date()));
        parameters.put("SignatureMethod", "HMAC-SHA1");
        parameters.put("SignatureVersion", "1.0");
        parameters.put("SignatureNonce", UUID.randomUUID().toString()); 
        parameters.put("Format", RESPONSE_FORMAT);
        parameters.put("Signature", computeSignature(parameters));
    }

    private String computeSignature(Map<String, String> parameters)  {
        String[] sortedKeys = parameters.keySet().toArray(new String[]{});
        Arrays.sort(sortedKeys);
        final String SEPARATOR = "&";

        StringBuilder canonicalizedQueryString = new StringBuilder();
		String signature = "";
		try {
			for(String key : sortedKeys) {
			    canonicalizedQueryString.append("&")
			    .append(percentEncode(key)).append("=")
			    .append(percentEncode(parameters.get(key)));
			}
			StringBuilder stringToSign = new StringBuilder();
			stringToSign.append(httpMethod).append(SEPARATOR);
			stringToSign.append(percentEncode("/")).append(SEPARATOR);
			stringToSign.append(percentEncode(
			        canonicalizedQueryString.toString().substring(1)));
			signature = calculateSignature(credentials.getSecretKey() + "&",
			        stringToSign.toString());
		} catch (UnsupportedEncodingException e) {
		} catch (Exception e) {
		}
        return signature;
    }

    private String formatIso8601Date(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(ISO8601_DATE_FORMAT);
        df.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return df.format(date);
    }

    private String calculateSignature(String key, String stringToSign){
        final String ALGORITHM = "HmacSHA1";
        byte[] signData = null;
		try {
			Mac mac = Mac.getInstance(ALGORITHM);
			mac.init(new SecretKeySpec(
			         key.getBytes(ENCODING), ALGORITHM));
			signData = mac.doFinal(
			          stringToSign.getBytes(ENCODING));
		} catch (InvalidKeyException e) {
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (IllegalStateException e) {
		}
        return new String(Base64.encodeBase64(signData));
    }

    private String percentEncode(String value)
            throws UnsupportedEncodingException{
        return value != null ?
                URLEncoder.encode(value, ENCODING).replace("+", "%20")
                .replace("*", "%2A").replace("%7E", "~")
                : null;
    }

    private String paramsToQueryString(Map<String, String> params)
            throws UnsupportedEncodingException{
        if (params == null || params.size() == 0){
            return null;
        }

        StringBuilder paramString = new StringBuilder();
        boolean first = true;
        for(Entry<String, String> p : params.entrySet()){
            String key = p.getKey();
            String val = p.getValue();
            if (!first){
                paramString.append("&");
            }
            paramString.append(URLEncoder.encode(key, ENCODING));

            if (val != null){
                paramString.append("=").append(
                        URLEncoder.encode(val, ENCODING));
            }
            first = false;
        }
        return paramString.toString();
    }

    private String readContent(InputStream content)
            throws IOException {
        if (content == null)
            return "";

        Reader reader = null;
        Writer writer = new StringWriter();
        String result;

        char[] buffer = new char[1024];
        try{
            reader = new BufferedReader(
                    new InputStreamReader(content, ENCODING));
            int n;
            while((n = reader.read(buffer)) > 0){
                writer.write(buffer, 0, n);
            }
            result = writer.toString();
        } finally {
            content.close();
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
        return result;
    }

    private void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) { }
        }
    }
}
