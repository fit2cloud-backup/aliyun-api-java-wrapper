package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class IpAddressSetType {
	private List<String> IpAddress;

	public List<String> getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(List<String> ipAddress) {
		IpAddress = ipAddress;
	}
	
	public List<String> getList() {
		return IpAddress;
	}

	@Override
	public String toString() {
		return "IpAddressSetType [IpAddress=" + IpAddress + "]";
	}
}
