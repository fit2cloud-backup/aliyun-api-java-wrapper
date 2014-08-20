package com.fit2cloud.aliyun.ecs.model;

public class DiskDeviceMapping {
	private String Device;
	private int Size;
	private String SnapshotId;
	public String getDevice() {
		return Device;
	}
	public void setDevice(String device) {
		Device = device;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getSnapshotId() {
		return SnapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "DiskDeviceMapping [Device=" + Device + ", Size=" + Size
				+ ", SnapshotId=" + SnapshotId + "]";
	}
}
