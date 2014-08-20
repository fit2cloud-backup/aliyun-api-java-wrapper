package com.fit2cloud.aliyun.ecs.model;

public class DataDisk {
	private Integer Size;
	private String Category;
	private String SnapshotId;
	private String DiskName;
	private String Description;
	private String Device;
	
	/**
	 * @param size
	 *            数据盘的磁盘大小。 以 GB 为单位,取值范围为 Cloud:5~2000 Ephemeral:5~1024
	 */
	public DataDisk(Integer size) {
		Size = size;
	}

	public Integer getSize() {
		return Size;
	}

	/**
	 * @param size
	 *            数据盘的磁盘大小。 以 GB 为单位,取值范围为 Cloud:5~2000 Ephemeral:5~1024
	 */
	public void setSize(Integer size) {
		Size = size;
	}

	public String getCategory() {
		return Category;
	}

	/**
	 * @param category
	 *            数据盘的磁盘种类<br>
	 *            可选值: <li>cloud – 云磁盘 <li>ephemeral- 本地磁盘 <br>
	 *            默认值:cloud
	 */
	public void setCategory(String category) {
		Category = category;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	/**
	 * @param snapshotId
	 *            创建数据盘使用的快照 指定该参数后 Size 会被忽略,实际创建的磁盘大小为指定快照的大小。若该快照创建于 2013 年
	 *            7 月 15 日(含)之前,该次调用会被拒绝,Response 中返回 InvalidSnapshot.TooOld
	 */
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	public String getDiskName() {
		return DiskName;
	}

	/**
	 * @param diskName
	 *            数据盘名称,不填则为空,默认值为空, [2,128] 英文或中文字符,必须以大小字母或中文开头, 可包含数字,
	 *            ”_”或”-”,磁盘名称会展示在控制 台。不能以 http://和 https://开头
	 */
	public void setDiskName(String diskName) {
		DiskName = diskName;
	}

	public String getDescription() {
		return Description;
	}

	/**
	 * @param description
	 *            数据盘描述,不填则为空,默认值为空, [2,256] 个字符,磁盘描述会展示在控制台。不能以 http://和
	 *            https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	public String getDevice() {
		return Device;
	}

	/**
	 * @param device
	 *            空表示由系统默认分配,/dev/xvdb 开始到 /dev/xvdz 默认值:空
	 */
	public void setDevice(String device) {
		Device = device;
	}

	@Override
	public String toString() {
		return "DataDisk [Size=" + Size + ", Category=" + Category
				+ ", SnapshotId=" + SnapshotId + ", DiskName=" + DiskName
				+ ", Description=" + Description + ", Device=" + Device + "]";
	}

}
