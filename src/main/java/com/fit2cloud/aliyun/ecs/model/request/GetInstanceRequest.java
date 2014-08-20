package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class GetInstanceRequest extends Request {
	private String InstanceId;

	public GetInstanceRequest(String instanceId) {
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
		return "GetInstanceRequest [InstanceId=" + InstanceId + "]";
	}

}
