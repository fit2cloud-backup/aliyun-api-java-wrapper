package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class DeleteImageRequest extends Request {
	private String RegionId;
	private String ImageId;

	public DeleteImageRequest(String regionId, String imageId) {
		RegionId = regionId;
		ImageId = imageId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            镜像所在的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getImageId() {
		return ImageId;
	}

	/**
	 * @param imageId
	 *            镜像 ID
	 */
	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	@Override
	public String toString() {
		return "DeleteImageRequest [RegionId=" + RegionId + ", ImageId="
				+ ImageId + "]";
	}

}
