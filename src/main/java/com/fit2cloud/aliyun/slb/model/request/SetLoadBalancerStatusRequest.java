package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class SetLoadBalancerStatusRequest extends Request {
	private String LoadBalancerId; 
	private String LoadBalancerStatus;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getLoadBalancerStatus() {
		return LoadBalancerStatus;
	}
	public void setLoadBalancerStatus(String loadBalancerStatus) {
		LoadBalancerStatus = loadBalancerStatus;
	}
}
