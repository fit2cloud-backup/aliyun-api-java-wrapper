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
	private String Progress;
	private String Status;

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

	public String getProgress() {
		return Progress;
	}

	public void setProgress(String progress) {
		Progress = progress;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Image [ImageId=");
		builder.append(ImageId);
		builder.append(", ImageVersion=");
		builder.append(ImageVersion);
		builder.append(", Architecture=");
		builder.append(Architecture);
		builder.append(", ImageName=");
		builder.append(ImageName);
		builder.append(", Description=");
		builder.append(Description);
		builder.append(", Size=");
		builder.append(Size);
		builder.append(", ImageOwnerAlias=");
		builder.append(ImageOwnerAlias);
		builder.append(", OSName=");
		builder.append(OSName);
		builder.append(", DiskDeviceMappings=");
		builder.append(DiskDeviceMappings);
		builder.append(", ProductCode=");
		builder.append(ProductCode);
		builder.append(", IsSubscribed=");
		builder.append(IsSubscribed);
		builder.append(", CreationTime=");
		builder.append(CreationTime);
		builder.append(", Progress=");
		builder.append(Progress);
		builder.append(", Status=");
		builder.append(Status);
		builder.append("]");
		return builder.toString();
	}
}