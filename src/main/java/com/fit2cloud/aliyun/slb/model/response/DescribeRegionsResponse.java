package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.Regions;

public class DescribeRegionsResponse extends Response {
	private Regions Regions;

	public Regions getRegions() {
		return Regions;
	}

	public void setRegions(Regions regions) {
		Regions = regions;
	}
}
