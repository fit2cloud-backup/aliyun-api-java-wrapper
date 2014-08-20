package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.SecurityGroups;

public class ListSecurityGroupsResponse extends PageableResponse {

	private SecurityGroups SecurityGroups = new SecurityGroups();

	public void setSecurityGroups(SecurityGroups securityGroups) {
		SecurityGroups = securityGroups;
	}

	public SecurityGroups getSecurityGroups() {
		return SecurityGroups;
	}

	public void add(PageableResponse response) {
		super.add(response);
		this.getSecurityGroups().getSecurityGroup()
				.addAll(((ListSecurityGroupsResponse)response).getSecurityGroups().getSecurityGroup());
	}

	@Override
	public String toString() {
		return "ListSecurityGroupsResponse [SecurityGroups=" + SecurityGroups
				+ ", TotalCount=" + TotalCount + ", PageNumber=" + PageNumber
				+ ", PageSize=" + PageSize + "]";
	}
}
