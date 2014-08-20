package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyDiskAttributeRequest extends Request {
	// required
	private String DiskId;

	// other fields
	private String DiskName;
	private String Description;
	private String DeleteWithInstance;

	public ModifyDiskAttributeRequest(String DiskId) {
		this.DiskId = DiskId;
	}

	public String getDiskId() {
		return DiskId;
	}

	/**
	 * @param diskId
	 *            磁盘 ID
	 */
	public void setDiskId(String diskId) {
		DiskId = diskId;
	}

	public String getDiskName() {
		return DiskName;
	}

	/**
	 * @param diskName
	 *            磁盘名称,不填则原值,默认值为空,[2,128]英文或中文字符,必须以大小字母或中文开头,可包含数字,”_”或”-”,
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
	 *            磁盘描述,不填则保持原值,默认值为空,[2,256]个字符,磁盘描述会展示在控制台。不能以 http://和
	 *            https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	public String getDeleteWithInstance() {
		return DeleteWithInstance;
	}

	/**
	 * @param deleteWithInstance
	 *            磁盘是否随实例释放:
	 *            > True 表示 Instance 释放时,这块磁盘随 Instance 一起释放;
	 *            > False 表示 Instance 释放时,这块磁盘保留不释放。
	 *            
	 *            在下列情况下,该参数设置成 false 时报错: 
	 *            > 当磁盘的 category 属性为ephemeral 
	 *            > 当磁盘的 category 属性为 cloud且 Portable 属性为 false. 
	 *            默认值:true
	 */
	public void setDeleteWithInstance(String deleteWithInstance) {
		DeleteWithInstance = deleteWithInstance;
	}
}
