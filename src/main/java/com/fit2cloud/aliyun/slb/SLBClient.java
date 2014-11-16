package com.fit2cloud.aliyun.slb;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.request.AddBackendServersRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerHTTPListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerTCPListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.DeleteLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.DeleteLoadBalancerRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeHealthStatusRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerHTTPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerTCPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancersRequest;
import com.fit2cloud.aliyun.slb.model.request.ModifyLoadBalancerInternetSpecRequest;
import com.fit2cloud.aliyun.slb.model.request.RemoveBackendServersRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerHTTPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerNameRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerStatusRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerTCPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.StartLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.StopLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.response.AddBackendServersResponse;
import com.fit2cloud.aliyun.slb.model.response.CreateLoadBalancerResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeHealthStatusResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeLoadBalancerAttributeResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeLoadBalancerHTTPListenerAttributeResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeLoadBalancerTCPListenerAttributeResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeLoadBalancersResponse;
import com.fit2cloud.aliyun.slb.model.response.DescribeRegionsResponse;
import com.fit2cloud.aliyun.slb.model.response.RemoveBackendServersResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SLBClient 
{
    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    private SLBRequest request;

    public SLBClient(AliyunCredentials credentials){
    	request = new SLBRequest(credentials);
    }
    
    public CreateLoadBalancerResponse createLoadBalancer(final CreateLoadBalancerRequest createLoadBalancerRequest) throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("CreateLoadBalancer", createLoadBalancerRequest.toMap()), CreateLoadBalancerResponse.class);
	}
    
    public Response modifyLoadBalancerInternetSpec(final ModifyLoadBalancerInternetSpecRequest modifyLoadBalancerInternetSpecRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("ModifyLoadBalancerInternetSpec", modifyLoadBalancerInternetSpecRequest.toMap()), Response.class);
    }
    
    public Response deleteLoadBalancer(final DeleteLoadBalancerRequest deleteLoadBalancerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DeleteLoadBalancer", deleteLoadBalancerRequest.toMap()), Response.class);
    }
    
    public Response setLoadBalancerStatus(final SetLoadBalancerStatusRequest setLoadBalancerStatusRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("SetLoadBalancerStatus", setLoadBalancerStatusRequest.toMap()), Response.class);
    }
    
    public Response setLoadBalancerName(final SetLoadBalancerNameRequest setLoadBalancerNameRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("SetLoadBalancerName", setLoadBalancerNameRequest.toMap()), Response.class);
    }
    
    public DescribeLoadBalancersResponse describeLoadBalancers(final DescribeLoadBalancersRequest describeLoadBalancersRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DescribeLoadBalancers", describeLoadBalancersRequest.toMap()), DescribeLoadBalancersResponse.class);
    }
    
    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(final DescribeLoadBalancerAttributeRequest describeLoadBalancerAttributeRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DescribeLoadBalancerAttribute", describeLoadBalancerAttributeRequest.toMap()), DescribeLoadBalancerAttributeResponse.class);
    }
    
    public DescribeRegionsResponse describeRegions() throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeRegions", null), DescribeRegionsResponse.class);
    }
     
    public Response createLoadBalancerHTTPListener(final CreateLoadBalancerHTTPListenerRequest createLoadBalancerHTTPListenerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("CreateLoadBalancerHTTPListener", createLoadBalancerHTTPListenerRequest.toMap()), Response.class);
    }
    
    public Response createLoadBalancerTCPListener(final CreateLoadBalancerTCPListenerRequest createLoadBalancerTCPListenerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("CreateLoadBalancerTCPListener", createLoadBalancerTCPListenerRequest.toMap()), Response.class);
    }
    
    public Response deleteLoadBalancerListener(final DeleteLoadBalancerListenerRequest deleteLoadBalancerListenerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DeleteLoadBalancerListener", deleteLoadBalancerListenerRequest.toMap()), Response.class);
    }
    
    public Response startLoadBalancerListener(final StartLoadBalancerListenerRequest startLoadBalancerListenerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("StartLoadBalancerListener", startLoadBalancerListenerRequest.toMap()), Response.class);
    }
    
    public Response stopLoadBalancerListener(final StopLoadBalancerListenerRequest stopLoadBalancerListenerRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("StopLoadBalancerListener", stopLoadBalancerListenerRequest.toMap()), Response.class);
    }
    
    public Response setLoadBalancerHTTPListenerAttribute(final SetLoadBalancerHTTPListenerAttributeRequest setLoadBalancerHTTPListenerAttributeRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("SetLoadBalancerHTTPListenerAttribute", setLoadBalancerHTTPListenerAttributeRequest.toMap()), Response.class);
    }
    
    public Response setLoadBalancerTCPListenerAttribute(final SetLoadBalancerTCPListenerAttributeRequest setLoadBalancerTCPListenerAttributeRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("SetLoadBalancerTCPListenerAttribute", setLoadBalancerTCPListenerAttributeRequest.toMap()), Response.class);
    }
    
	public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(
			final DescribeLoadBalancerHTTPListenerAttributeRequest describeLoadBalancerHTTPListenerAttributeRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute(
				"DescribeLoadBalancerHTTPListenerAttribute",
				describeLoadBalancerHTTPListenerAttributeRequest.toMap()),
				DescribeLoadBalancerHTTPListenerAttributeResponse.class);
	}
	
	public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(
			final DescribeLoadBalancerTCPListenerAttributeRequest describeLoadBalancerTCPListenerAttributeRequest)
					throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute(
				"DescribeLoadBalancerTCPListenerAttribute",
				describeLoadBalancerTCPListenerAttributeRequest.toMap()),
				DescribeLoadBalancerTCPListenerAttributeResponse.class);
	}

	public AddBackendServersResponse addBackendServers(final AddBackendServersRequest addBackendServersRequest) throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("AddBackendServers", addBackendServersRequest.toMap()), AddBackendServersResponse.class);
	}
	
	public RemoveBackendServersResponse removeBackendServers(final RemoveBackendServersRequest removeBackendServersRequest) throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("RemoveBackendServers", removeBackendServersRequest.toMap()), RemoveBackendServersResponse.class);
	}
	
	public DescribeHealthStatusResponse describeHealthStatus(final DescribeHealthStatusRequest describeHealthStatusRequest) throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DescribeHealthStatus", describeHealthStatusRequest.toMap()), DescribeHealthStatusResponse.class);
	}
	
}
