package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;

public class CreateSnapshotResponse extends Response {
	private String SnapshotId;

	public String getSnapshotId() {
		return SnapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "CreateSnapshotResponse [SnapshotId=" + SnapshotId + "]";
	}

}
