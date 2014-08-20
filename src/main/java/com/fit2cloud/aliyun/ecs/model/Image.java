package com.fit2cloud.aliyun.ecs.model;

public class Image {
	private String ImageId;
	private String ImageVersion;
	private String Architecture;
	private String ImageName;
	private String Description;
	private Integer Size;
	private String ImageOwnerAlias;
	private String OSName;
	private DiskDeviceMappings DiskDeviceMappings;
	private String ProductCode;
	private String IsSubscribed;
	private String CreationTime;

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getImageVersion() {
		return ImageVersion;
	}

	public void setImageVersion(String imageVersion) {
		ImageVersion = imageVersion;
	}

	public String getArchitecture() {
		return Architecture;
	}

	public void setArchitecture(String architecture) {
		Architecture = architecture;
	}

	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Integer getSize() {
		return Size;
	}

	public void setSize(Integer size) {
		Size = size;
	}

	public String getImageOwnerAlias() {
		return ImageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		ImageOwnerAlias = imageOwnerAlias;
	}

	public String getOSName() {
		return OSName;
	}

	public void setOSName(String oSName) {
		OSName = oSName;
	}

	public DiskDeviceMappings getDiskDeviceMappings() {
		return DiskDeviceMappings;
	}

	public void setDiskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
		DiskDeviceMappings = diskDeviceMappings;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public String getIsSubscribed() {
		return IsSubscribed;
	}

	public void setIsSubscribed(String isSubscribed) {
		IsSubscribed = isSubscribed;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	@Override
	public String toString() {
		return "Image [ImageId=" + ImageId + ", ImageVersion=" + ImageVersion
				+ ", Architecture=" + Architecture + ", ImageName=" + ImageName
				+ ", Description=" + Description + ", Size=" + Size
				+ ", ImageOwnerAlias=" + ImageOwnerAlias + ", OSName=" + OSName
				+ ", DiskDeviceMappings=" + DiskDeviceMappings
				+ ", ProductCode=" + ProductCode + ", IsSubscribed="
				+ IsSubscribed + ", CreationTime=" + CreationTime + "]";
	}
}