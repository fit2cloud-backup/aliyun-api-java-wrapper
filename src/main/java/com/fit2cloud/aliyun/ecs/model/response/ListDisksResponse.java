package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.Disks;

public class ListDisksResponse extends PageableResponse {

	private Disks Disks = new Disks();

	public Disks getDisks() {
		return Disks;
	}

	public void setDisks(Disks disks) {
		Disks = disks;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getDisks().getDisk().addAll(
				((ListDisksResponse) response).getDisks().getDisk());
	}

	@Override
	public String toString() {
		return "ListDisksResponse [Disks=" + Disks + ", TotalCount="
				+ TotalCount + ", PageNumber=" + PageNumber + ", PageSize="
				+ PageSize + ", RequestId=" + RequestId + "]";
	}

}
