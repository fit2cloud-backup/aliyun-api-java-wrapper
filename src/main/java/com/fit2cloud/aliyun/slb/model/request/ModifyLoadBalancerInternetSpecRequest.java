package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyLoadBalancerInternetSpecRequest extends Request {
	private String LoadBalancerId;
	private String InternetChargeType;
	private Integer Bandwidth;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public Integer getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		Bandwidth = bandwidth;
	}
}
