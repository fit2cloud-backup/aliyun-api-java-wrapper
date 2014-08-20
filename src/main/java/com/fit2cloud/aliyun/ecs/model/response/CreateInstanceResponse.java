package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;


public class CreateInstanceResponse extends Response {
	private String InstanceId;

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	@Override
	public String toString() {
		return "CreateInstanceResponse [InstanceId=" + InstanceId
				+ ", RequestId=" + RequestId + "]";
	}

}
