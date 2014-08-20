package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;

public class CreateImageResponse extends Response {
	private String ImageId;

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	@Override
	public String toString() {
		return "CreateImageResponse [ImageId=" + ImageId + "]";
	}

}
