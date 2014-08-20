package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class Regions {
	private List<Region> Region;

	public List<Region> getList() {
		return Region;
	}

	@Override
	public String toString() {
		return "Regions [Region=" + Region + "]";
	}

}