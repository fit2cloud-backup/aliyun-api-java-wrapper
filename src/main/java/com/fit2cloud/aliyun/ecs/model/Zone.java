package com.fit2cloud.aliyun.ecs.model;

public class Zone {
	private String ZoneId;
	private String LocalName;
	private AvailableResourceCreation AvailableResourceCreation;
	private AvailableDiskCategories AvailableDiskCategories;

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String ZoneId) {
		this.ZoneId = ZoneId;
	}

	public String getLocalName() {
		return LocalName;
	}

	public void setLocalName(String localName) {
		this.LocalName = localName;
	}

	public AvailableResourceCreation getAvailableResourceCreation() {
		return AvailableResourceCreation;
	}

	public void setAvailableResourceCreation(
			AvailableResourceCreation availableResourceCreation) {
		AvailableResourceCreation = availableResourceCreation;
	}

	public AvailableDiskCategories getAvailableDiskCategories() {
		return AvailableDiskCategories;
	}

	public void setAvailableDiskCategories(
			AvailableDiskCategories availableDiskCategories) {
		AvailableDiskCategories = availableDiskCategories;
	}

	@Override
	public String toString() {
		return "Zone [ZoneId=" + ZoneId + ", LocalName=" + LocalName
				+ ", AvailableResourceCreation=" + AvailableResourceCreation
				+ ", AvailableDiskCategories=" + AvailableDiskCategories + "]";
	}

}