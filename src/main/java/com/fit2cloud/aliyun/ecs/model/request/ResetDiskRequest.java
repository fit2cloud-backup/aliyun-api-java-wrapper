package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ResetDiskRequest extends Request {
	private String DiskId;
	private String SnapshotId;

	public ResetDiskRequest(String diskId, String snapshotId) {
		DiskId = diskId;
		SnapshotId = snapshotId;
	}

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "ResetDiskRequest [DiskId=" + DiskId + ", SnapshotId="
				+ SnapshotId + "]";
	}
}
