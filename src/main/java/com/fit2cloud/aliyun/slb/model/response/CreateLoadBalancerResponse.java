package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;

public class CreateLoadBalancerResponse extends Response {
	private String LoadBalancerId; 
	private String Address; 
	private String LoadBalancerName;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLoadBalancerName() {
		return LoadBalancerName;
	}
	public void setLoadBalancerName(String loadBalancerName) {
		LoadBalancerName = loadBalancerName;
	}
}
