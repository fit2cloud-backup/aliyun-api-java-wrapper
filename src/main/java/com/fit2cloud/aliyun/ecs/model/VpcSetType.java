package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class VpcSetType {
	private String VpcId;
	private String RegionId;
	private String Status;
	private String VpcName;
	private VSwitchIds VSwitchIds;
	private String CidrBlock;
	private String VRouterId;
	private String Description;
	private String CreationTime;
	public String getVpcId() {
		return VpcId;
	}
	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getVpcName() {
		return VpcName;
	}
	public void setVpcName(String vpcName) {
		VpcName = vpcName;
	}
	public VSwitchIds getVSwitchIds() {
		return VSwitchIds;
	}
	public void setVSwitchIds(VSwitchIds vSwitchIds) {
		VSwitchIds = vSwitchIds;
	}
	public String getCidrBlock() {
		return CidrBlock;
	}
	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}
	public String getVRouterId() {
		return VRouterId;
	}
	public void setVRouterId(String vRouterId) {
		VRouterId = vRouterId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	@Override
	public String toString() {
		return "VpcSetType [VpcId=" + VpcId + ", RegionId=" + RegionId
				+ ", Status=" + Status + ", VpcName=" + VpcName
				+ ", VSwitchIds=" + VSwitchIds + ", CidrBlock=" + CidrBlock
				+ ", VRouterId=" + VRouterId + ", Description=" + Description
				+ ", CreationTime=" + CreationTime + "]";
	}
}
