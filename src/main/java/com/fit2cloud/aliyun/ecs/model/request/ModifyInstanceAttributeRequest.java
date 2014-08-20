package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyInstanceAttributeRequest extends Request {

	private String InstanceId;
	private String InstanceName;
	private String Description;
	private String Password;
	private String HostName;

	public ModifyInstanceAttributeRequest(String InstanceId) {
		this.InstanceId = InstanceId;
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

	public String getInstanceName() {
		return InstanceName;
	}

	/**
	 * @param instanceName
	 *            实例的显示名称,[2,128]英文或中文字符,必须以大小字母或中文开头,可包含数字,”_”或”-”。不能以 http://和
	 *            https://开头
	 */
	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}

	public String getDescription() {
		return Description;
	}

	/**
	 * @param description
	 *            实例的描述,[2,256]个字符。实例描述会显示在控制台。默认为空。不能以 http://和 https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            重置为用户指定的密码,密码只能是数字或者英文字母。长度必须在 6~30 个英文字符
	 */
	public void setPassword(String password) {
		Password = password;
	}

	public String getHostName() {
		return HostName;
	}

	/**
	 * @param hostName
	 *            表示操作系统内部的计算机名,最少 2 字符,“.”和“-”是不能作为 hostname
	 *            的首尾字符,不能连续使用。Windows 平台最长为 15
	 *            字符,允许字母(不限制大小写)、数字和“-”组成,不支持点号(”.”),不能全是数字。其他(Linux 等)平台最长为 30
	 *            字符,允许支持多个点号,点之间为一段,每段允许字母(不限制大小写)、数字和“-”组成
	 */
	public void setHostName(String hostName) {
		HostName = hostName;
	}

	@Override
	public String toString() {
		return "ModifyInstanceAttributeRequest [InstanceId=" + InstanceId
				+ ", InstanceName=" + InstanceName + ", Description="
				+ Description + ", Password=" + Password + ", HostName="
				+ HostName + "]";
	}

}
