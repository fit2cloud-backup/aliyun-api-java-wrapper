package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class StopOrRebootInstanceRequest extends Request {
	private String InstanceId;
	private String ForceStop;

	public StopOrRebootInstanceRequest(String instanceId) {
		InstanceId = instanceId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getForceStop() {
		return ForceStop;
	}

	public void setForceStop(String forceStop) {
		ForceStop = forceStop;
	}

	@Override
	public String toString() {
		return "StopOrRebootInstanceRequest [InstanceId=" + InstanceId
				+ ", ForceStop=" + ForceStop + "]";
	}

}
