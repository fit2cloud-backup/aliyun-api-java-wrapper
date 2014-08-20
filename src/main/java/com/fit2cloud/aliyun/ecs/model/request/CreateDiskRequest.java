package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateDiskRequest extends Request {

	// required
	private String RegionId;
	private String ZoneId;

	// other fields
	private String DiskName;
	private String Description;
	private Integer Size;
	private String SnapshotId;

	public CreateDiskRequest(String RegionId, String ZoneId, int size) {
		this.RegionId = RegionId;
		this.ZoneId = ZoneId;
		this.SnapshotId = "";
		this.Size = size;
	}

	public CreateDiskRequest(String RegionId, String ZoneId, String SnapshotId) {
		this.RegionId = RegionId;
		this.ZoneId = ZoneId;
		this.SnapshotId = SnapshotId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            实例所属的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getZoneId() {
		return ZoneId;
	}

	/**
	 * @param zoneId
	 *            可用区 ID
	 */
	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getDiskName() {
		return DiskName;
	}

	/**
	 * @param diskName
	 *            磁盘名称,不填则为空,默认值为空,[2,128]英文或中文字符,必须以大小字母或中文开头,可包含数字,”_”或”-”,
	 *            磁盘名称会展示在控制台。不能以 http://和 https://开头
	 */
	public void setDiskName(String diskName) {
		DiskName = diskName;
	}

	public String getDescription() {
		return Description;
	}

	/**
	 * @param description
	 *            磁盘描述,不填则为空,默认值为空,[2,256]个字符,磁盘描述会展示在控制台。不能以 http://和
	 *            https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	public Integer getSize() {
		return Size;
	}

	/**
	 * @param size
	 *            数据盘的磁盘大小以 GB 为单位,取值范围为 5~2000如果指定了 SnapshotId,则忽略,会使用实际快照大小
	 */
	public void setSize(Integer size) {
		Size = size;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	/**
	 * @param snapshotId
	 *            创建数据盘使用的快照指定该参数后 Size 会被忽略,实际创建的磁盘大小为指定快照的大小2013 年 7 月 15
	 *            日(含)前的快照不能用来创建磁盘
	 */
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	@Override
	public String toString() {
		return "CreateDiskRequest [RegionId=" + RegionId + ", ZoneId=" + ZoneId
				+ ", DiskName=" + DiskName + ", Description=" + Description
				+ ", Size=" + Size + ", SnapshotId=" + SnapshotId + "]";
	}

}
