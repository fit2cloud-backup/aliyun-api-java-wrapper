package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class AvailableResourceCreation {
	private List<String> ResourceTypes;

	public List<String> getResourceTypes() {
		return ResourceTypes;
	}

	public void setResourceTypes(List<String> resourceTypes) {
		ResourceTypes = resourceTypes;
	}

	@Override
	public String toString() {
		return "AvailableResourceCreation [ResourceTypes=" + ResourceTypes
				+ "]";
	}
}