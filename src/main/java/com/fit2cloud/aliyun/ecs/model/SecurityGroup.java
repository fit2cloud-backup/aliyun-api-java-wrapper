package com.fit2cloud.aliyun.ecs.model;

public class SecurityGroup {
	private String SecurityGroupId;
	private String Description;
	private String SecurityGroupName;
	private String VpcId;
	private String CreationTime;

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

	public String getSecurityGroupName() {
		return SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	@Override
	public String toString() {
		return "SecurityGroup [SecurityGroupId=" + SecurityGroupId
				+ ", Description=" + Description + ", SecurityGroupName="
				+ SecurityGroupName + ", VpcId=" + VpcId + ", CreationTime="
				+ CreationTime + "]";
	}
}