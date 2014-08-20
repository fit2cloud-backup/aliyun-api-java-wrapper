package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.AutoSnapshotExcutionStatus;
import com.fit2cloud.aliyun.ecs.model.AutoSnapshotPolicy;

public class ListAutoSnapshotPolicyResponse extends Response {
	private AutoSnapshotPolicy AutoSnapshotPolicy;
	private AutoSnapshotExcutionStatus AutoSnapshotExcutionStatus;

	public AutoSnapshotPolicy getAutoSnapshotPolicy() {
		return AutoSnapshotPolicy;
	}

	public void setAutoSnapshotPolicy(AutoSnapshotPolicy autoSnapshotPolicy) {
		AutoSnapshotPolicy = autoSnapshotPolicy;
	}

	public AutoSnapshotExcutionStatus getAutoSnapshotExcutionStatus() {
		return AutoSnapshotExcutionStatus;
	}

	public void setAutoSnapshotExcutionStatus(
			AutoSnapshotExcutionStatus autoSnapshotExcutionStatus) {
		AutoSnapshotExcutionStatus = autoSnapshotExcutionStatus;
	}

	@Override
	public String toString() {
		return "DescribeAutoSnapshotPolicyResponse [AutoSnapshotPolicy="
				+ AutoSnapshotPolicy + ", AutoSnapshotExcutionStatus="
				+ AutoSnapshotExcutionStatus + "]";
	}

}
