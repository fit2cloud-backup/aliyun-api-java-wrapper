package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class VRouterSetTypes {
	private List<VRouterSetType> VRouter = new ArrayList<VRouterSetType>();;

	public List<VRouterSetType> getVRouter() {
		return VRouter;
	}

	public void setVRouter(List<VRouterSetType> vRouter) {
		VRouter = vRouter;
	}
	
	public List<VRouterSetType> getList() {
		return VRouter;
	}

	@Override
	public String toString() {
		return "VRouterSetTypes [VRouter=" + VRouter + "]";
	}
}
