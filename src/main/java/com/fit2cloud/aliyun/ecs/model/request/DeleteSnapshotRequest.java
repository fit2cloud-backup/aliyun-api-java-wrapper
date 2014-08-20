package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class DeleteSnapshotRequest extends Request {
	private String SnapshotId;

	public DeleteSnapshotRequest(String snapshotId) {
		SnapshotId = snapshotId;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "DeleteSnapshotRequest [SnapshotId=" + SnapshotId + "]";
	}
}
