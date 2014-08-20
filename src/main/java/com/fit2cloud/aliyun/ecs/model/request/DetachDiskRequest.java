package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class DetachDiskRequest extends Request {
	private String InstanceId;
	private String DiskId;

	public DetachDiskRequest(String instanceId, String diskId) {
		InstanceId = instanceId;
		DiskId = diskId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	@Override
	public String toString() {
		return "DetachDiskRequest [InstanceId=" + InstanceId + ", DiskId="
				+ DiskId + "]";
	}

}
