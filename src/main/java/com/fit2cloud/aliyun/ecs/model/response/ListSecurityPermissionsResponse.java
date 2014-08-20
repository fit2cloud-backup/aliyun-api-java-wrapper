package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.Permissions;

public class ListSecurityPermissionsResponse extends Response {
	private String Description;
	private Permissions Permissions;

	public Permissions getPermissions() {
		return Permissions;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "ListSecurityPermissionsResponse [Description=" + Description
				+ ", Permissions=" + Permissions + "]";
	}

}
