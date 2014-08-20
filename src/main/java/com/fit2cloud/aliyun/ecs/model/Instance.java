package com.fit2cloud.aliyun.ecs.model;

public class Instance {
	// required
	private String RegionId;
	private String ImageId;
	private String InstanceType;
	private String SecurityGroupId;

	// other fields
	private String ZoneId;
	private String InstanceName;
	private String Description;
	private String InternetChargeType;
	private Integer InternetMaxBandwidthIn;
	private Integer InternetMaxBandwidthOut;
	private String HostName;
	private String Password;

	/**
	 * @param regionId
	 *            实例所属的 Region ID
	 * @param imageId
	 *            镜像文件 ID,表示启动实例时选择的镜像资源
	 * @param instanceType
	 *            实例的资源规则。取值参见附表实例资源规格对照表,也可以调用查询实例资源规格列表接口获得最新的规格表
	 * @param securityGroupId
	 *            指定新创建实例所属于的安全组代码,同一个安全组内的实例之间可以互相访问。
	 */
	public Instance(String regionId, String imageId, String instanceType,
			String securityGroupId) {
		RegionId = regionId;
		ImageId = imageId;
		InstanceType = instanceType;
		SecurityGroupId = securityGroupId;
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
	 *            实例所属的可用区编号,空表示由系统选择, 默认值:空。
	 */
	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getImageId() {
		return ImageId;
	}

	/**
	 * @param imageId
	 *            镜像文件 ID,表示启动实例时选择的镜像资源
	 */
	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getInstanceType() {
		return InstanceType;
	}

	/**
	 * @param instanceType
	 *            实例的资源规则。取值参见附表实例资源规格对照表,也可以调用查询实例资源规格列表接口获得最新的规格表
	 */
	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	/**
	 * @param securityGroupId
	 *            指定新创建实例所属于的安全组代码,同一个安全组内的实例之间可以互相访问。
	 */
	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	/**
	 * @param instanceName
	 *            实例的显示名称,[2,128]英文或中文字符,必须以大小字母或中文开头,可包含数字,”_” 或”-”。
	 *            实例名称会显示在控制台。 如果没有指定该参数,默认值为实例的 InstanceId 不能以 http://和
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
	 *            实例的描述,[2,256]个字符,实例描述会显示在控制台。 不填则为空,默认为空。 不能以http://和
	 *            https://开头。
	 */
	public void setDescription(String description) {
		Description = description;
	}

	public String getInternetChargeType() {
		return InternetChargeType;
	}

	/**
	 * @param internetChargeType
	 *            网络计费类型,按流量计费还是按固定带宽计费。 <br>
	 *            可选值: <li>PayByBandwidth <li>PayByTraffic <br>
	 *            如用户不指定,默认是 PayByBandwidth
	 */
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}

	public Integer getInternetMaxBandwidthIn() {
		return InternetMaxBandwidthIn;
	}

	/**
	 * @param internetMaxBandwidthIn
	 *            公网入带宽最大值,单位为 Mbps(Mega bit per second),取值范围:[1,200]
	 *            如果客户不指定,AliyunAPI 将自动将入带宽设置成 200Mbps。
	 */
	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		InternetMaxBandwidthIn = internetMaxBandwidthIn;
	}

	public Integer getInternetMaxBandwidthOut() {
		return InternetMaxBandwidthOut;
	}

	/**
	 * @param internetMaxBandwidthOut
	 *            公网出带宽最大值,单位为 Mbps(Mega bit per second),取值范围: 按带宽计费:[1,100]
	 *            如果客户不指定,API 将自动将出带宽设置成 0Mbps。 按流量计费: [1,100] 如果客户不指定,会报错。
	 *            如果需要可以通过阿里云工单系统申请将带宽范围设置成 1~200Mbps
	 */
	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		InternetMaxBandwidthOut = internetMaxBandwidthOut;
	}

	public String getHostName() {
		return HostName;
	}

	/**
	 * @param hostName
	 *            表示云服务器的主机名,最少 2 字符, "."和"-"是不能作为 hostname 的首尾字符,不能连续使用。
	 * 
	 *            Windows 平台最长为 15 字符, 允许字母(不限制大小写)、数字和“-”组成,不支持点号("."),不能全是数字。
	 * 
	 *            其他(Linux 等)平台最长为 30 字符,
	 *            允许支持多个点号,点之间为一段,每段允许字母(不限制大小写)、数字和“-”组成。
	 */
	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            实例的密码。用户传入的密码只能是数字或者 英文字母,必须在 6~30 个字节。 如果传入 Password 参数,请务必使用
	 *            HTTPS 协议调用 API 以避免可能发生的密码泄露
	 */
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Instance [RegionId=" + RegionId + ", ZoneId=" + ZoneId
				+ ", ImageId=" + ImageId + ", InstanceType=" + InstanceType
				+ ", SecurityGroupId=" + SecurityGroupId + ", InstanceName="
				+ InstanceName + ", Description=" + Description
				+ ", InternetChargeType=" + InternetChargeType
				+ ", InternetMaxBandwidthIn=" + InternetMaxBandwidthIn
				+ ", InternetMaxBandwidthOut=" + InternetMaxBandwidthOut
				+ ", HostName=" + HostName + ", Password=" + Password + "]";
	}
}
