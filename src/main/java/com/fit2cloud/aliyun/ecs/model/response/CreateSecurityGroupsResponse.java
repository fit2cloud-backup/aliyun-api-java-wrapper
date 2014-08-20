package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;


public class CreateSecurityGroupsResponse extends Response {
	private String SecurityGroupId;

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}
}
