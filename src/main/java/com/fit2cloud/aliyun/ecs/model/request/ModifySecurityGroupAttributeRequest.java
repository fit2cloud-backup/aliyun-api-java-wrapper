package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifySecurityGroupAttributeRequest extends Request {

	// required
	private String RegionId;
	private String SecurityGroupId;

	private String SecurityGroupName;
	private String Description;
	
	public ModifySecurityGroupAttributeRequest(String RegionId, String SecurityGroupId, String SecurityGroupName, String Description) {
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.SecurityGroupName = SecurityGroupName;
		this.Description = Description;
	}
	
	public ModifySecurityGroupAttributeRequest(String RegionId, String SecurityGroupId, String SecurityGroupName) {
		this(RegionId, SecurityGroupId, SecurityGroupName, null);
	}

	public ModifySecurityGroupAttributeRequest(String RegionId, String SecurityGroupId) {
		this(RegionId, SecurityGroupId, null, null);
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getSecurityGroupName() {
		return SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "ModifySecurityGroupAttributeRequest [RegionId=" + RegionId
				+ ", SecurityGroupId=" + SecurityGroupId
				+ ", SecurityGroupName=" + SecurityGroupName + ", Description="
				+ Description + "]";
	}
}
