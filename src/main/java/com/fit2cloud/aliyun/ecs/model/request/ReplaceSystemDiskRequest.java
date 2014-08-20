package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ReplaceSystemDiskRequest extends Request {
	private String InstanceId;
	private String ImageId;

	public ReplaceSystemDiskRequest(String instanceId, String imageId) {
		InstanceId = instanceId;
		ImageId = imageId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	@Override
	public String toString() {
		return "ReplaceSystemDiskRequest [InstanceId=" + InstanceId
				+ ", ImageId=" + ImageId + "]";
	}
}
