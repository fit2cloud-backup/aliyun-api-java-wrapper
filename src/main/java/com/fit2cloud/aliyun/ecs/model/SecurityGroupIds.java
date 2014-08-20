package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class SecurityGroupIds {
	List<String> SecurityGroupId;

	@Override
	public String toString() {
		return "SecurityGroupIds [SecurityGroupId=" + SecurityGroupId + "]";
	}

	public List<String> getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(List<String> securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public List<String> getList() {
		return SecurityGroupId;
	}
}