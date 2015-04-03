package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListVRoutersRequest extends PageableRequest {

	// required
	private String RegionId;

	// other fields
	private String VRouterId;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param RegionId
	 */
	public ListVRoutersRequest(String RegionId) {
		this.RegionId = RegionId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            磁盘所属于的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}


	public String getVRouterId() {
		return VRouterId;
	}

	public void setVRouterId(String vRouterId) {
		VRouterId = vRouterId;
	}

	@Override
	public String toString() {
		return "ListVRoutersRequest [RegionId=" + RegionId + ", VRouterId="
				+ VRouterId + ", PageNumber=" + PageNumber + ", PageSize="
				+ PageSize + "]";
	}
}
