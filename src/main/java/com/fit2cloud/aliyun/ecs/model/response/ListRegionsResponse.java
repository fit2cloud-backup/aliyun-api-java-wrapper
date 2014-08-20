package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.Regions;

public class ListRegionsResponse extends Response {
	private Regions Regions;

	public Regions getRegions() {
		return Regions;
	}

	@Override
	public String toString() {
		return "ListRegionsResponse [Regions=" + Regions + "]";
	}

}
