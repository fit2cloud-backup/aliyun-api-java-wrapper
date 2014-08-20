package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListSecurityGroupsRequest extends PageableRequest {
	private String RegionId;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param regionId
	 *            地域
	 */
	public ListSecurityGroupsRequest(String regionId) {
		RegionId = regionId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            地域
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	@Override
	public String toString() {
		return "ListSecurityGroupsRequest [RegionId=" + RegionId
				+ ", PageNumber=" + PageNumber + ", PageSize=" + PageSize + "]";
	}

}
