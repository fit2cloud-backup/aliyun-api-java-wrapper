package com.fit2cloud.aliyun.ecs.model;

public class Region {
	private String RegionId;
	private String LocalName;

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getLocalName() {
		return LocalName;
	}

	public void setLocalName(String localName) {
		LocalName = localName;
	}

	@Override
	public String toString() {
		return "Region [RegionId=" + RegionId + ", LocalName=" + LocalName
				+ "]";
	}
}