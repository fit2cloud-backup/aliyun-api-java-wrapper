package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class DeleteOrReInitDiskRequest extends Request {
	private String DiskId;

	public DeleteOrReInitDiskRequest(String diskId) {
		DiskId = diskId;
	}

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	@Override
	public String toString() {
		return "DeleteDiskRequest [DiskId=" + DiskId + "]";
	}

}
