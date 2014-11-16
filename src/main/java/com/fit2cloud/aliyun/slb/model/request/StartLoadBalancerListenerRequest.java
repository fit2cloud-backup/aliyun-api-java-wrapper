package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class StartLoadBalancerListenerRequest extends Request {
	private String LoadBalancerId; 
	private Integer ListenerPort;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public Integer getListenerPort() {
		return ListenerPort;
	}
	public void setListenerPort(Integer listenerPort) {
		ListenerPort = listenerPort;
	}
}
