package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class RemoveBackendServersRequest extends Request {
	private String LoadBalancerId; 
	private String BackendServers;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getBackendServers() {
		return BackendServers;
	}
	public void setBackendServers(String backendServers) {
		BackendServers = backendServers;
	}
}
