package com.fit2cloud.aliyun.ecs.model;

public class SystemDisk {
	private String Category;
	private String DiskName;
	private String Description;

	public String getCategory() {
		return Category;
	}

	/**
	 * @param category
	 *            系统盘的磁盘种类:云磁盘(cloud)或临时磁盘(ephemeral) <br>
	 *            可选值: <li>cloud <li>ephemeral <br>
	 *            默认值:cloud
	 */
	public void setCategory(String category) {
		Category = category;
	}

	public String getDiskName() {
		return DiskName;
	}

	/**
	 * @param diskName
	 *            系统盘名称,不填则为空,默认值为空, [2,128]英文或中文字符,必须以大小字母或中文开头, 可包含数字,
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
	 *            系统盘描述,不填则为空,默认值为空, [2,256] 个字符,实例描述会显示在控制台。不填则为 空,默认为空。不能以
	 *            http://和 https://开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "SystemDisk [Category=" + Category + ", DiskName=" + DiskName
				+ ", Description=" + Description + "]";
	}

}
