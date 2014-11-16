package com.fit2cloud.aliyun.slb.model;

import java.util.List;

public class BackendServersHealthStatus {
	private List<BackendServerHealthStatus> BackendServer;

	public List<BackendServerHealthStatus> getBackendServer() {
		return BackendServer;
	}

	public void setBackendServer(List<BackendServerHealthStatus> backendServer) {
		BackendServer = backendServer;
	}
}
