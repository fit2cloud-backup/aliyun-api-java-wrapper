package com.fit2cloud.aliyun.ecs.model;

public class Disk {
	private String DiskId;
	private String RegionId;
	private String ZoneId;
	private String DiskName;
	private String Description;
	private String Type;
	private String Category;
	private int Size;
	private String ImageId;
	private String SourceSnapshotId;
	private String ProductCode;
	private String Portable;
	private String Status;
	private OperationLocks OperationLocks;
	private String InstanceId;
	private String Device;
	private String DeleteWithInstance;
	private String DeleteAutoSnapshot;
	private String CreationTime;
	private String AttachedTime;
	private String DetachedTime;

	public String getDiskId() {
		return DiskId;
	}

	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getDiskName() {
		return DiskName;
	}

	public void setDiskName(String diskName) {
		DiskName = diskName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getSourceSnapshotId() {
		return SourceSnapshotId;
	}

	public void setSourceSnapshotId(String sourceSnapshotId) {
		SourceSnapshotId = sourceSnapshotId;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public String getPortable() {
		return Portable;
	}

	public void setPortable(String portable) {
		Portable = portable;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public OperationLocks getOperationLocks() {
		return OperationLocks;
	}

	public void setOperationLocks(OperationLocks operationLocks) {
		OperationLocks = operationLocks;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getDevice() {
		return Device;
	}

	public void setDevice(String device) {
		Device = device;
	}

	public String getDeleteWithInstance() {
		return DeleteWithInstance;
	}

	public void setDeleteWithInstance(String deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}

	public String getDeleteAutoSnapshot() {
		return DeleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(String deleteAutoSnapshot) {
		DeleteAutoSnapshot = deleteAutoSnapshot;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public String getAttachedTime() {
		return AttachedTime;
	}

	public void setAttachedTime(String attachedTime) {
		AttachedTime = attachedTime;
	}

	public String getDetachedTime() {
		return DetachedTime;
	}

	public void setDetachedTime(String detachedTime) {
		DetachedTime = detachedTime;
	}

	@Override
	public String toString() {
		return "Disk [DiskId=" + DiskId + ", RegionId=" + RegionId
				+ ", ZoneId=" + ZoneId + ", DiskName=" + DiskName
				+ ", Description=" + Description + ", Type=" + Type
				+ ", Category=" + Category + ", Size=" + Size + ", ImageId="
				+ ImageId + ", SourceSnapshotId=" + SourceSnapshotId
				+ ", ProductCode=" + ProductCode + ", Portable=" + Portable
				+ ", Status=" + Status + ", OperationLocks=" + OperationLocks
				+ ", InstanceId=" + InstanceId + ", Device=" + Device
				+ ", DeleteWithInstance=" + DeleteWithInstance
				+ ", DeleteAutoSnapshot=" + DeleteAutoSnapshot
				+ ", CreationTime=" + CreationTime + ", AttachedTime="
				+ AttachedTime + ", DetachedTime=" + DetachedTime + "]";
	}

}