package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.InstanceStatuses;

public class ListInstancesResponse extends PageableResponse {
	private InstanceStatuses InstanceStatuses = new InstanceStatuses();

	public InstanceStatuses getInstanceStatuses() {
		return InstanceStatuses;
	}

	public void setInstanceStatuses(InstanceStatuses instanceStatuses) {
		InstanceStatuses = instanceStatuses;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getInstanceStatuses().getInstanceStatus()
				.addAll(((ListInstancesResponse) response).getInstanceStatuses().getInstanceStatus());
	}

	@Override
	public String toString() {
		return "ListInstancesResponse [InstanceStatuses=" + InstanceStatuses
				+ ", TotalCount=" + TotalCount + ", PageNumber=" + PageNumber
				+ ", PageSize=" + PageSize + ", RequestId=" + RequestId + "]";
	}

}
