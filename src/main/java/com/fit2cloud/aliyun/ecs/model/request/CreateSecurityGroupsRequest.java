package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateSecurityGroupsRequest extends Request {
	private String RegionId;
	private String Description;

	public CreateSecurityGroupsRequest(String regionId, String description) {
		RegionId = regionId;
		Description = description;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
