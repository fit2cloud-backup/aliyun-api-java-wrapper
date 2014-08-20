package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class InnerIpAddress {
	List<String> IpAddress;

	@Override
	public String toString() {
		return "InnerIpAddress [IpAddress=" + IpAddress + "]";
	}

	public List<String> getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(List<String> ipAddress) {
		IpAddress = ipAddress;
	}
	
	public List<String> getList(){
		return IpAddress;
	}
}