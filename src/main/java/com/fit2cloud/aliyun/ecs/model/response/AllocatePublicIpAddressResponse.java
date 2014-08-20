package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;


public class AllocatePublicIpAddressResponse extends Response {
	private String IpAddress;

	public String getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}

}
