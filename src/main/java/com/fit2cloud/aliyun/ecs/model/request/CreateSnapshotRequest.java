package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateSnapshotRequest extends Request {
	private String DiskId;
	private String SnapshotName;
	private String Description;

	public CreateSnapshotRequest(String DiskId) {
		this.DiskId = DiskId;
	}

	public String getDiskId() {
		return DiskId;
	}

	/**
	 * @param diskId
	 *            指定的磁盘 ID
	 */
	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getSnapshotName() {
		return SnapshotName;
	}

	/**
	 * @param snapshotName
	 *            快照的显示名称 [2,128]英文或中文字符,必须以大小字母或中文开头,可包含数字, ”_”或”-”,且不能以 auto
	 *            开头(auto开头的快照名是预留给自动快照的)。快照的显示名称会显示在控制台中。不能以http://和 https://开头
	 */
	public void setSnapshotName(String snapshotName) {
		SnapshotName = snapshotName;
	}

	public String getDescription() {
		return Description;
	}

	/**
	 * @param description
	 *            快照的描述, [2,256]个字符。快照的描述会显示在控制台中。不填则为空,默认为空。不能以 http://和
	 *            https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}
}
