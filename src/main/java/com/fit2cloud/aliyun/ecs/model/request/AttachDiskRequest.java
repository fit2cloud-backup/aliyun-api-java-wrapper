package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class AttachDiskRequest extends Request {

	private String InstanceId;
	private String DiskId;
	private String Device;
	private String DeleteWithInstance;

	public AttachDiskRequest(String InstanceId, String DiskId) {
		this.InstanceId = InstanceId;
		this.DiskId = DiskId;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	/**
	 * @param instanceId
	 *            目标云服务器 ID
	 */
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getDiskId() {
		return DiskId;
	}

	/**
	 * @param diskId
	 *            磁盘 ID,磁盘和 Instance 必须在同一个 Zone
	 */
	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getDevice() {
		return Device;
	}

	/**
	 * @param device
	 *            空表示由系统默认分配, /dev/xvdb 开始到/dev/xvdz, 默认值:空
	 */
	public void setDevice(String device) {
		Device = device;
	}

	public String getDeleteWithInstance() {
		return DeleteWithInstance;
	}

	/**
	 * @param deleteWithInstance
	 *            磁盘是否随实例释放:True 表示 Instance 释放时,这块磁盘随 Instance 一起释放;False 表示
	 *            Instance 释放时,这块磁盘保留不释放。默认值:无,表示保留当前值
	 */
	public void setDeleteWithInstance(String deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}

	@Override
	public String toString() {
		return "AttachDiskRequest [InstanceId=" + InstanceId + ", DiskId="
				+ DiskId + ", Device=" + Device + ", DeleteWithInstance="
				+ DeleteWithInstance + "]";
	}

}
