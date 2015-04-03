package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class VSwitchIds {
	private List<String> VSwitchId;

	public List<String> getVSwitchId() {
		return VSwitchId;
	}

	public void setVSwitchId(List<String> vSwitchId) {
		VSwitchId = vSwitchId;
	}

	@Override
	public String toString() {
		return "VSwitchIds [VSwitchId=" + VSwitchId + "]";
	}
	
}
