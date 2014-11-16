package com.fit2cloud.aliyun.slb.model;

public class BackendServer {
	private String ServerId; 
	private Integer Weight;
	public String getServerId() {
		return ServerId;
	}
	public void setServerId(String serverId) {
		ServerId = serverId;
	}
	public Integer getWeight() {
		return Weight;
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}
}
