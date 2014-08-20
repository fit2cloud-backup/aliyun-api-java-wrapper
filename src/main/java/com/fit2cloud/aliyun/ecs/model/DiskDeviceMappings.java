package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class DiskDeviceMappings {
	private List<DiskDeviceMapping> DiskDeviceMapping;

	public List<DiskDeviceMapping> getDiskDeviceMapping() {
		return DiskDeviceMapping;
	}

	public void setDiskDeviceMapping(List<DiskDeviceMapping> diskDeviceMapping) {
		DiskDeviceMapping = diskDeviceMapping;
	}

	public List<DiskDeviceMapping> getList() {
		return DiskDeviceMapping;
	}

	@Override
	public String toString() {
		return "DiskDeviceMappings [DiskDeviceMapping=" + DiskDeviceMapping
				+ "]";
	}
}
