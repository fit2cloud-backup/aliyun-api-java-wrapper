package com.fit2cloud.aliyun.ecs.model;

public class InstanceStatus {
	private String InstanceId;
	private String Status;

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "InstanceStatus [InstanceId=" + InstanceId + ", Status="
				+ Status + "]";
	}
}