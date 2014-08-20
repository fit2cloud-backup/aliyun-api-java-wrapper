package com.fit2cloud.aliyun.ecs.model;

public class AutoSnapshotPolicy {
	private String SystemDiskPolicyEnabled;
	private Integer SystemDiskPolicyTimePeriod;
	private Integer SystemDiskPolicyRetentionDays;
	private String SystemDiskPolicyRetentionLastWeek;
	private String DataDiskPolicyEnabled;
	private Integer DataDiskPolicyTimePeriod;
	private Integer DataDiskPolicyRetentionDays;
	private String DataDiskPolicyRetentionLastWeek;

	public String getSystemDiskPolicyEnabled() {
		return SystemDiskPolicyEnabled;
	}

	/**
	 * @param systemDiskPolicyEnabled
	 *            系统盘自动快照策略开关: True:系统盘执行自动快照策略 False:系统盘不执行自动快照策略
	 */
	public void setSystemDiskPolicyEnabled(String systemDiskPolicyEnabled) {
		SystemDiskPolicyEnabled = systemDiskPolicyEnabled;
	}

	public Integer getSystemDiskPolicyTimePeriod() {
		return SystemDiskPolicyTimePeriod;
	}

	/**
	 * @param systemDiskPolicyTimePeriod
	 *            系统盘自动快照策略的时间段: 4 个时间段, 
	 *            1:1:00-7:00 
	 *            2:7:00-13:00 
	 *            3:13:00-19:00
	 *            4:19:00-1:00
	 */
	public void setSystemDiskPolicyTimePeriod(Integer systemDiskPolicyTimePeriod) {
		SystemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
	}

	public Integer getSystemDiskPolicyRetentionDays() {
		return SystemDiskPolicyRetentionDays;
	}

	/**
	 * @param systemDiskPolicyRetentionDays
	 *            系统盘自动快照策略的保留天数: 1|2|3
	 */
	public void setSystemDiskPolicyRetentionDays(
			Integer systemDiskPolicyRetentionDays) {
		SystemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
	}

	public String getSystemDiskPolicyRetentionLastWeek() {
		return SystemDiskPolicyRetentionLastWeek;
	}

	/**
	 * @param systemDiskPolicyRetentionLastWeek
	 *            系统盘自动快照策略的保留上周日选项: True:保留上周日的快照, False:不保留
	 */
	public void setSystemDiskPolicyRetentionLastWeek(
			String systemDiskPolicyRetentionLastWeek) {
		SystemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
	}

	public String getDataDiskPolicyEnabled() {
		return DataDiskPolicyEnabled;
	}

	/**
	 * @param dataDiskPolicyEnabled
	 *            数据盘自动快照策略的开关: True:数据盘执行自动快照策略 False:数据盘不执行自动快照策略
	 */
	public void setDataDiskPolicyEnabled(String dataDiskPolicyEnabled) {
		DataDiskPolicyEnabled = dataDiskPolicyEnabled;
	}

	public Integer getDataDiskPolicyTimePeriod() {
		return DataDiskPolicyTimePeriod;
	}

	/**
	 * @param dataDiskPolicyTimePeriod
	 *            数据盘自动快照策略的保留天数: 4 个时间段, 
	 *            1:1:00-7:00 
	 *            2:7:00-13:00 
	 *            3:13:00-19:00
	 *            4:19:00-1:00
	 */
	public void setDataDiskPolicyTimePeriod(Integer dataDiskPolicyTimePeriod) {
		DataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
	}

	public Integer getDataDiskPolicyRetentionDays() {
		return DataDiskPolicyRetentionDays;
	}

	/**
	 * @param dataDiskPolicyRetentionDays
	 *            保留自动快照的天数, 1|2|3
	 */
	public void setDataDiskPolicyRetentionDays(
			Integer dataDiskPolicyRetentionDays) {
		DataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
	}

	public String getDataDiskPolicyRetentionLastWeek() {
		return DataDiskPolicyRetentionLastWeek;
	}

	/**
	 * @param dataDiskPolicyRetentionLastWeek
	 *            数据盘自动快照策略的保留上周日选项: True:代表保留上周日的快照 False:不保留
	 */
	public void setDataDiskPolicyRetentionLastWeek(
			String dataDiskPolicyRetentionLastWeek) {
		DataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
	}

	@Override
	public String toString() {
		return "AutoSnapshotPolicy [SystemDiskPolicyEnabled="
				+ SystemDiskPolicyEnabled + ", SystemDiskPolicyTimePeriod="
				+ SystemDiskPolicyTimePeriod
				+ ", SystemDiskPolicyRetentionDays="
				+ SystemDiskPolicyRetentionDays
				+ ", SystemDiskPolicyRetentionLastWeek="
				+ SystemDiskPolicyRetentionLastWeek
				+ ", DataDiskPolicyEnabled=" + DataDiskPolicyEnabled
				+ ", DataDiskPolicyTimePeriod=" + DataDiskPolicyTimePeriod
				+ ", DataDiskPolicyRetentionDays="
				+ DataDiskPolicyRetentionDays
				+ ", DataDiskPolicyRetentionLastWeek="
				+ DataDiskPolicyRetentionLastWeek + "]";
	}
}
