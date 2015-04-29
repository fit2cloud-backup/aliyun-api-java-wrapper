package com.fit2cloud.aliyun.bss;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.BaseModuleRequest;

public class BSSRequest extends BaseModuleRequest {

    private static final String API_VERSION = "2014-07-14";
	private static final String ENDPOINT = "https://bss.aliyuncs.com";

	public BSSRequest(AliyunCredentials credentials) {
        super(credentials, ENDPOINT, API_VERSION);
    }
	
    protected void addCommonParams(String action, Map<String, String> parameters) {
        parameters.put("Action", action);
        parameters.put("Version", apiVersion);
        parameters.put("AccessKeyId", credentials.getAccessKeyId());
        parameters.put("Timestamp", formatIso8601Date(new Date()));
        parameters.put("SignatureMethod", "HMAC-SHA1");
        parameters.put("SignatureVersion", "1.0");
        parameters.put("SignatureNonce", UUID.randomUUID().toString()); 
        parameters.put("Format", RESPONSE_FORMAT);
        parameters.put("Signature", computeSignature(parameters));
    }
}
