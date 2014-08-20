package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class AllocatePublicIpAddressRequest extends Request {
	private String InstanceId;

	public AllocatePublicIpAddressRequest(String instanceId) {
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
		return "AllocatePublicIpAddressRequest [InstanceId=" + InstanceId + "]";
	}

}
