package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class DescribeLoadBalancersRequest extends Request {
	private String RegionId; 
	private String LoadBalancerId;
	private String AddressType;
	private String InternetChargeType;
	private String ServerId;
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public String getServerId() {
		return ServerId;
	}
	public void setServerId(String serverId) {
		ServerId = serverId;
	}
}
