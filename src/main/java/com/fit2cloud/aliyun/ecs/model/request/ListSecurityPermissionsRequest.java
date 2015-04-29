package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ListSecurityPermissionsRequest extends Request {
	private String RegionId;
	private String SecurityGroupId;
	private String NicType;

	public ListSecurityPermissionsRequest(String regionId,
			String securityGroupId) {
		RegionId = regionId;
		SecurityGroupId = securityGroupId;
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

	public String getNicType() {
		return NicType;
	}

	public void setNicType(String nicType) {
		NicType = nicType;
	}
}
