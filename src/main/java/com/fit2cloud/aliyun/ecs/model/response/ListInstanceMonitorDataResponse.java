package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.MonitorData;

public class ListInstanceMonitorDataResponse extends Response {
	private MonitorData MonitorData;

	public MonitorData getMonitorData() {
		return MonitorData;
	}

	public void setMonitorData(MonitorData monitorData) {
		MonitorData = monitorData;
	}

	@Override
	public String toString() {
		return "ListInstanceMonitorDataResponse [MonitorData=" + MonitorData
				+ "]";
	}
}
