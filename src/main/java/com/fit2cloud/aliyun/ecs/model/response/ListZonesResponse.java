package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.Zones;

public class ListZonesResponse extends Response {
	private Zones Zones;

	public Zones getZones() {
		return Zones;
	}

	@Override
	public String toString() {
		return "ListZonesResponse [Zones=" + Zones + "]";
	}

}
