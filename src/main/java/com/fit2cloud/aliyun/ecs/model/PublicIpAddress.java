package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class PublicIpAddress {
	List<String> IpAddress;

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
		return "PublicIpAddress [IpAddress=" + IpAddress + "]";
	}

}