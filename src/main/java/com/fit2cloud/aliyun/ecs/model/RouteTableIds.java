package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class RouteTableIds {
	private List<String> RouteTableId;

	public List<String> getRouteTableId() {
		return RouteTableId;
	}

	public void setRouteTableId(List<String> routeTableId) {
		RouteTableId = routeTableId;
	}

	@Override
	public String toString() {
		return "RouteTableIds [RouteTableId=" + RouteTableId + "]";
	}
	
}
