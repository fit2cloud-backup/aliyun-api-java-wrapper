package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class StartInstanceRequest extends Request {
	private String InstanceId;

	public StartInstanceRequest(String instanceId) {
		InstanceId = instanceId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	@Override
	public String toString() {
		return "StartInstanceRequest [InstanceId=" + InstanceId + "]";
	}

}
