package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class AvailableDiskCategories {
	private List<String> DiskCategories;

	public List<String> getDiskCategories() {
		return DiskCategories;
	}

	public void setDiskCategories(List<String> diskCategories) {
		DiskCategories = diskCategories;
	}

	@Override
	public String toString() {
		return "AvailableDiskCategories [DiskCategories=" + DiskCategories
				+ "]";
	}
}