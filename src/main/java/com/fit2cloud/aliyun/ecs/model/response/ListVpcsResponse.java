package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.VpcSetTypes;

public class ListVpcsResponse extends PageableResponse {
	private VpcSetTypes Vpcs = new VpcSetTypes();

	public VpcSetTypes getVpcs() {
		return Vpcs;
	}

	public void setVpcs(VpcSetTypes vpcs) {
		Vpcs = vpcs;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getVpcs().getList()
				.addAll(((ListVpcsResponse) response).getVpcs().getVpc());
	}

	@Override
	public String toString() {
		return "ListVpcsResponse [Vpcs=" + Vpcs + ", TotalCount=" + TotalCount
				+ ", PageNumber=" + PageNumber + ", PageSize=" + PageSize
				+ ", RequestId=" + RequestId + "]";
	}

}
