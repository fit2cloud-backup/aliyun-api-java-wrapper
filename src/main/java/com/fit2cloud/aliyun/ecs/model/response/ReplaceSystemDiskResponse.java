package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;

public class ReplaceSystemDiskResponse extends Response {

	private String DiskId;

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	@Override
	public String toString() {
		return "ReplaceSystemDiskResponse [DiskId=" + DiskId + "]";
	}

}
