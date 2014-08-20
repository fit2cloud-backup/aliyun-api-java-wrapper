package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class Snapshots {
	private List<SnapshotResource> SnapshotResource = new ArrayList<SnapshotResource>();

	public List<SnapshotResource> getSnapshotResource() {
		return SnapshotResource;
	}

	public void setSnapshotResource(List<SnapshotResource> snapshotResource) {
		SnapshotResource = snapshotResource;
	}

	public List<SnapshotResource> getList() {
		return SnapshotResource;
	}

	@Override
	public String toString() {
		return "Snapshots [SnapshotResource=" + SnapshotResource + "]";
	}
}
