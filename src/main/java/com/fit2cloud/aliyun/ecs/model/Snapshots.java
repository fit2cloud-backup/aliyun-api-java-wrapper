package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class Snapshots {
	private List<Snapshot> Snapshot = new ArrayList<Snapshot>();

	public List<Snapshot> getSnapshotResource() {
		return Snapshot;
	}

	public void setSnapshotResource(List<Snapshot> snapshotResource) {
		Snapshot = snapshotResource;
	}

	public List<Snapshot> getList() {
		return Snapshot;
	}

	@Override
	public String toString() {
		return "Snapshots [Snapshot=" + Snapshot + "]";
	}
}
