package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class InstanceStatuses {
	List<InstanceStatus> InstanceStatus = new ArrayList<InstanceStatus>();

	public List<InstanceStatus> getInstanceStatus() {
		return InstanceStatus;
	}

	public void setInstanceStatus(List<InstanceStatus> instanceStatus) {
		InstanceStatus = instanceStatus;
	}

	public List<InstanceStatus> getList() {
		return InstanceStatus;
	}

	@Override
	public String toString() {
		return "InstanceStatuses [InstanceStatus=" + InstanceStatus + "]";
	}

}