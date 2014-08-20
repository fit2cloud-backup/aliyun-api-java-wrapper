package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ListZonesRequest extends Request {
	private String RegionId;

	public ListZonesRequest(String regionId) {
		RegionId = regionId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            目标 RegionId
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	@Override
	public String toString() {
		return "ListZonesRequest [RegionId=" + RegionId + "]";
	}

}
