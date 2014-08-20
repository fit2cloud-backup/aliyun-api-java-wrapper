package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class InstanceTypes {
	private List<InstanceType> InstanceType;

	public List<InstanceType> getList() {
		return InstanceType;
	}

	@Override
	public String toString() {
		return "InstanceTypes [InstanceType=" + InstanceType + "]";
	}

}