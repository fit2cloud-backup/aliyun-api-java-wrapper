package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.BackendServers;

public class AddBackendServersResponse extends Response {
	private String LoadBalancerId; 
	private BackendServers BackendServers;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public BackendServers getBackendServers() {
		return BackendServers;
	}
	public void setBackendServers(BackendServers backendServers) {
		BackendServers = backendServers;
	} 
}
