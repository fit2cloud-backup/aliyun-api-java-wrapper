package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListSnapshotsRequest extends PageableRequest {

	// required
	private String RegionId;

	// other fields
	private String InstanceId;
	private String DiskId;
	private String SnapshotIds;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param RegionId
	 */
	public ListSnapshotsRequest(String RegionId) {
		this.RegionId = RegionId;
	}
	
	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            镜像所属地域 Id
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	/**
	 * @param instanceId
	 *            指定的实例 ID
	 */
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getDiskId() {
		return DiskId;
	}

	/**
	 * @param diskId
	 *            指定的磁盘设备 ID
	 */
	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getSnapshotIds() {
		return SnapshotIds;
	}

	/**
	 * @param snapshotIds
	 *            快照标识编码. SnapshotIds 的 Json string
	 *            格式为:["s-xxxxxxxxx","s-yyyyyyyyy", ... "s-zzzzzzzzz"],最多 10 个
	 *            Id,用半角逗号字符隔开
	 */
	public void setSnapshotIds(String snapshotIds) {
		SnapshotIds = snapshotIds;
	}
}
