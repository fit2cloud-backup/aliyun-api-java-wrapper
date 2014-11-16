package com.fit2cloud.aliyun.slb.model;

public class LoadBalancer {
	private String LoadBalancerId; 
	private String LoadBalancerName; 
	private String LoadBalancerStatus;
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
	public String getLoadBalancerStatus() {
		return LoadBalancerStatus;
	}
	public void setLoadBalancerStatus(String loadBalancerStatus) {
		LoadBalancerStatus = loadBalancerStatus;
	} 
}
