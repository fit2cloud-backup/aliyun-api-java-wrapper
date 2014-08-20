package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.Snapshots;

public class ListSnapshotsResponse extends PageableResponse {
	private Snapshots Snapshots = new Snapshots();

	public Snapshots getSnapshots() {
		return Snapshots;
	}

	public void setSnapshots(Snapshots snapshots) {
		Snapshots = snapshots;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getSnapshots().getSnapshotResource().addAll(
				((ListSnapshotsResponse)response).getSnapshots().getSnapshotResource());
	}

	@Override
	public String toString() {
		return "ListSnapshotsResponse [Snapshots=" + Snapshots
				+ ", TotalCount=" + TotalCount + ", PageNumber=" + PageNumber
				+ ", PageSize=" + PageSize + ", RequestId=" + RequestId + "]";
	}
}
