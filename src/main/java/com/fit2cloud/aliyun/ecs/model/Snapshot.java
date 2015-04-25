package com.fit2cloud.aliyun.ecs.model;

public class Snapshot {
	private String CreationTime;
	private String Description;
	private String SourceDiskId;
	private String SourceDiskType;
	private String ProductCode;
	private String SnapshotName;
	private String Progress;
	private String SourceDiskSize;
	private String SnapshotId;

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getSourceDiskId() {
		return SourceDiskId;
	}

	public void setSourceDiskId(String sourceDiskId) {
		SourceDiskId = sourceDiskId;
	}

	public String getSourceDiskType() {
		return SourceDiskType;
	}

	public void setSourceDiskType(String sourceDiskType) {
		SourceDiskType = sourceDiskType;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public String getSnapshotName() {
		return SnapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		SnapshotName = snapshotName;
	}

	public String getProgress() {
		return Progress;
	}

	public void setProgress(String progress) {
		Progress = progress;
	}

	public String getSourceDiskSize() {
		return SourceDiskSize;
	}

	public void setSourceDiskSize(String sourceDiskSize) {
		SourceDiskSize = sourceDiskSize;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "SnapshotResource [CreationTime=" + CreationTime
				+ ", Description=" + Description + ", SourceDiskId="
				+ SourceDiskId + ", SourceDiskType=" + SourceDiskType
				+ ", ProductCode=" + ProductCode + ", SnapshotName="
				+ SnapshotName + ", Progress=" + Progress + ", SourceDiskSize="
				+ SourceDiskSize + ", SnapshotId=" + SnapshotId + "]";
	}
}
