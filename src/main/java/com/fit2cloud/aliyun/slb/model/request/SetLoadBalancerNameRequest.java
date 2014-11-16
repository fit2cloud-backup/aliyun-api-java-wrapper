package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class SetLoadBalancerNameRequest extends Request {
	private String LoadBalancerId; 
	private String LoadBalancerName;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getLoadBalancerName() {
		return LoadBalancerName;
	}
	public void setLoadBalancerName(String loadBalancerName) {
		LoadBalancerName = loadBalancerName;
	}
}
