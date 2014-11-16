package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateLoadBalancerRequest extends Request {
	private String RegionId;
	private String LoadBalancerName;
	private String AddressType;
	private String InternetChargeType;
	private Integer Bandwidth;
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getLoadBalancerName() {
		return LoadBalancerName;
	}
	public void setLoadBalancerName(String loadBalancerName) {
		LoadBalancerName = loadBalancerName;
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
	public Integer getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		Bandwidth = bandwidth;
	}
}
