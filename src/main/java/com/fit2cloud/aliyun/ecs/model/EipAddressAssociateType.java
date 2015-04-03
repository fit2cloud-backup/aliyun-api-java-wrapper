package com.fit2cloud.aliyun.ecs.model;

public class EipAddressAssociateType {
	private String AllocationId;
	private String IpAddress;
	private String Bandwidth;
	private String InternetChargeType;
	public String getAllocationId() {
		return AllocationId;
	}
	public void setAllocationId(String allocationId) {
		AllocationId = allocationId;
	}
	public String getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	public String getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(String bandwidth) {
		Bandwidth = bandwidth;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	@Override
	public String toString() {
		return "EipAddressAssociateType [AllocationId=" + AllocationId
				+ ", IpAddress=" + IpAddress + ", Bandwidth=" + Bandwidth
				+ ", InternetChargeType=" + InternetChargeType + "]";
	}
}
