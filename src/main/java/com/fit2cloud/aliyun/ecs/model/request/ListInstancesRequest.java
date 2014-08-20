package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListInstancesRequest extends PageableRequest {
	private String RegionId;
	private String ZoneId;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param regionId
	 */
	public ListInstancesRequest(String regionId) {
		super();
		RegionId = regionId;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	@Override
	public String toString() {
		return "ListInstancesRequest [RegionId=" + RegionId + ", ZoneId="
				+ ZoneId + "]";
	}

}
