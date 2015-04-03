package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListVpcsRequest extends PageableRequest {

	// required
	private String RegionId;

	// other fields
	private String VpcId;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param RegionId
	 */
	public ListVpcsRequest(String RegionId) {
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

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	@Override
	public String toString() {
		return "ListVpcsRequest [RegionId=" + RegionId + ", VpcId=" + VpcId
				+ ", PageNumber=" + PageNumber + ", PageSize=" + PageSize + "]";
	}
}
