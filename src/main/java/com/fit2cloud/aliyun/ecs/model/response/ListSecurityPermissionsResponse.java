package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.Permissions;

public class ListSecurityPermissionsResponse extends Response {
	private String Description;
	private Permissions Permissions;
	private String SecurityGroupId;
	private String SecurityGroupName;
	private String RegionId;
	private String VpcId;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Permissions getPermissions() {
		return Permissions;
	}

	public void setPermissions(Permissions permissions) {
		Permissions = permissions;
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

	public String getRegionId() {
		return RegionId;
	}

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
		return "ListSecurityPermissionsResponse [Description=" + Description
				+ ", Permissions=" + Permissions + ", SecurityGroupId="
				+ SecurityGroupId + ", SecurityGroupName=" + SecurityGroupName
				+ ", RegionId=" + RegionId + ", VpcId=" + VpcId + "]";
	}

}
