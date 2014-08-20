package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class Permissions {
	private List<Permission> Permission;

	public List<Permission> getList() {
		return Permission;
	}

	@Override
	public String toString() {
		return "Permissions [Permission=" + Permission + "]";
	}

}