package com.fit2cloud.aliyun.ecs.model;

public class SecurityGroup {
	private String SecurityGroupId;
	private String Description;

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "SecurityGroup [SecurityGroupId=" + SecurityGroupId
				+ ", Description=" + Description + "]";
	}
}