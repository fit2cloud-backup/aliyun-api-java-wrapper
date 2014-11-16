package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.BackendServersHealthStatus;

public class DescribeHealthStatusResponse extends Response {
	private BackendServersHealthStatus BackendServers;

	public BackendServersHealthStatus getBackendServers() {
		return BackendServers;
	}

	public void setBackendServers(BackendServersHealthStatus backendServers) {
		BackendServers = backendServers;
	}
}
