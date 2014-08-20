package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class SecurityGroups {
	private List<SecurityGroup> SecurityGroup = new ArrayList<SecurityGroup>();

	public List<SecurityGroup> getSecurityGroup() {
		return SecurityGroup;
	}

	public void setSecurityGroup(List<SecurityGroup> securityGroup) {
		SecurityGroup = securityGroup;
	}

	public List<SecurityGroup> getList() {
		return SecurityGroup;
	}

	@Override
	public String toString() {
		return "SecurityGroups [SecurityGroup=" + SecurityGroup + "]";
	}

}