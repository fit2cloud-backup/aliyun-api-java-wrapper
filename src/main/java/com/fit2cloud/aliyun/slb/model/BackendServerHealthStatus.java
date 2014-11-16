package com.fit2cloud.aliyun.slb.model;

public class BackendServerHealthStatus {
	private String ServerId; 
	private String ServerHealthStatus;
	public String getServerId() {
		return ServerId;
	}
	public void setServerId(String serverId) {
		ServerId = serverId;
	}
	public String getServerHealthStatus() {
		return ServerHealthStatus;
	}
	public void setServerHealthStatus(String serverHealthStatus) {
		ServerHealthStatus = serverHealthStatus;
	}
}
