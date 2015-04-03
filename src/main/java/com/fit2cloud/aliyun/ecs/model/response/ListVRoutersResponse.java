package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.VRouterSetTypes;

public class ListVRoutersResponse extends PageableResponse {
	private VRouterSetTypes VRouters = new VRouterSetTypes();

	public VRouterSetTypes getVRouters() {
		return VRouters;
	}

	public void setVRouters(VRouterSetTypes vRouters) {
		VRouters = vRouters;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getVRouters().getList()
				.addAll(((ListVRoutersResponse) response).getVRouters().getVRouter());
	}

	@Override
	public String toString() {
		return "ListVRoutersResponse [VRouters=" + VRouters + ", TotalCount="
				+ TotalCount + ", PageNumber=" + PageNumber + ", PageSize="
				+ PageSize + ", RequestId=" + RequestId + "]";
	}

}
