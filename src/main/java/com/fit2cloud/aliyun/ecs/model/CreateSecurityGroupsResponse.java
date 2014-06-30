package com.fit2cloud.aliyun.ecs.model;


public class CreateSecurityGroupsResponse extends Response {
	private String SecurityGroupId;

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}
}
