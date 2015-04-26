package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class InstanceAttributesType {
	List<InstanceAttributes> Instance = new ArrayList<InstanceAttributes>();

	public List<InstanceAttributes> getInstance() {
		return Instance;
	}

	public void setInstance(List<InstanceAttributes> instance) {
		this.Instance = instance;
	}

	public List<InstanceAttributes> getList() {
		return Instance;
	}
	
	@Override
	public String toString() {
		return "InstanceAttributesType [Instance=" + Instance + "]";
	}
}
