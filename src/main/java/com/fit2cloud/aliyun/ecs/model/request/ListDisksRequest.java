package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListDisksRequest extends PageableRequest {

	// required
	private String RegionId;

	// other fields
	private String ZoneId;
	private String DiskIds;
	private String InstanceId;
	private String DiskType;
	private String Category;
	private String Status;
	private String SnapshotId;
	private String Portable;
	private String DeleteWithInstance;
	private String DeleteAutoSnapshot;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param RegionId
	 */
	public ListDisksRequest(String RegionId) {
		this.RegionId = RegionId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            磁盘所属于的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getZoneId() {
		return ZoneId;
	}

	/**
	 * @param zoneId
	 *            默认值为空,空代表查询所有可用区下的磁盘
	 */
	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getDiskIds() {
		return DiskIds;
	}

	/**
	 * @param diskIds
	 *            一个带有格式的 Json Array, DiskIds 的 Json string
	 *            格式:["d-xxxxxxxxx","d-yyyyyyyyy", ..., "d-zzzzzzzzz"],最多 10 个
	 *            Id,用半角逗号字符隔开。
	 */
	public void setDiskIds(String diskIds) {
		DiskIds = diskIds;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	/**
	 * @param instanceId
	 *            实例 ID
	 */
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getDiskType() {
		return DiskType;
	}

	/**
	 * @param diskType
	 *            all|system|data,默认值为 all
	 */
	public void setDiskType(String diskType) {
		DiskType = diskType;
	}

	public String getCategory() {
		return Category;
	}

	/**
	 * @param category
	 *            磁盘种类,all|cloud|ephemeral。默认值为 all
	 */
	public void setCategory(String category) {
		Category = category;
	}

	public String getStatus() {
		return Status;
	}

	/**
	 * @param status
	 *            磁盘状态,
	 *            In_use|Available|Attaching|Detaching|Creating|ReIniting|All
	 *            ,默认值为 All
	 */
	public void setStatus(String status) {
		Status = status;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	/**
	 * @param snapshotId
	 *            创建磁盘使用的快照
	 */
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	public String getPortable() {
		return Portable;
	}

	/**
	 * @param portable
	 *            True 代表是独立云磁盘,可以独立存在且可以自由在可用区内挂载和下载,false
	 *            代表非独立云磁盘,只能和实例同生同灭。用户如果需要做 attach 和detach 操作,必须先查询一下这个属性为 true
	 *            的磁盘才能操作。临时磁盘,云磁盘的系统盘和包月的云磁盘,该属性都为 false。这个属性用户不能更改
	 */
	public void setPortable(String portable) {
		Portable = portable;
	}

	public String getDeleteWithInstance() {
		return DeleteWithInstance;
	}

	/**
	 * @param deleteWithInstance
	 *            磁盘是否随实例释放: True 表示 Instance 释放时,这块磁盘随 Instance 一起释放;False 表示
	 *            Instance 释放时,这块磁盘保留不释放。
	 */
	public void setDeleteWithInstance(String deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}

	public String getDeleteAutoSnapshot() {
		return DeleteAutoSnapshot;
	}

	/**
	 * @param deleteAutoSnapshot
	 *            删除磁盘时,是否同时删除自动快照。True 表示同时删除自动快照, False 表示保留自动快照
	 */
	public void setDeleteAutoSnapshot(String deleteAutoSnapshot) {
		DeleteAutoSnapshot = deleteAutoSnapshot;
	}

	@Override
	public String toString() {
		return "ListDisksRequest [RegionId=" + RegionId + ", ZoneId=" + ZoneId
				+ ", DiskIds=" + DiskIds + ", InstanceId=" + InstanceId
				+ ", DiskType=" + DiskType + ", Category=" + Category
				+ ", Status=" + Status + ", SnapshotId=" + SnapshotId
				+ ", Portable=" + Portable + ", DeleteWithInstance="
				+ DeleteWithInstance + ", DeleteAutoSnapshot="
				+ DeleteAutoSnapshot + ", PageNumber=" + PageNumber
				+ ", PageSize=" + PageSize + "]";
	}
}
