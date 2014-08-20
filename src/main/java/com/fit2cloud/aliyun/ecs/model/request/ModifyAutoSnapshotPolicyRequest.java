package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyAutoSnapshotPolicyRequest extends Request {

	private String SystemDiskPolicyEnabled;
	private String SystemDiskPolicyTimePeriod;
	private String SystemDiskPolicyRetentionDays;
	private String SystemDiskPolicyRetentionLastWeek;
	private String DataDiskPolicyEnabled;
	private String DataDiskPolicyTimePeriod;
	private String DataDiskPolicyRetentionDays;
	private String DataDiskPolicyRetentionLastWeek;

	public String getSystemDiskPolicyEnabled() {
		return SystemDiskPolicyEnabled;
	}

	/**
	 * @param systemDiskPolicyEnabled
	 *            系统盘自动快照策略开关: True:该磁盘属性的磁盘打自动快照, False:不打自动快照,默认值:无,表示保留当前值
	 */
	public void setSystemDiskPolicyEnabled(String systemDiskPolicyEnabled) {
		SystemDiskPolicyEnabled = systemDiskPolicyEnabled;
	}

	public String getSystemDiskPolicyTimePeriod() {
		return SystemDiskPolicyTimePeriod;
	}

	/**
	 * @param systemDiskPolicyTimePeriod
	 *            系统盘自动快照策略的时间段: 4 个时间段, 
	 *            1:1:00-7:00 
	 *            2:7:00-13:00 
	 *            3:13:00-19:00
	 *            4:19:00-1:00 
	 *            默认值:无,表示保留当前值
	 */
	public void setSystemDiskPolicyTimePeriod(String systemDiskPolicyTimePeriod) {
		SystemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
	}

	public String getSystemDiskPolicyRetentionDays() {
		return SystemDiskPolicyRetentionDays;
	}

	/**
	 * @param systemDiskPolicyRetentionDays
	 *            系统盘自动快照策略的保留天数: 可选值, 1,2,3, 默认值:无,表示保留当前值
	 */
	public void setSystemDiskPolicyRetentionDays(
			String systemDiskPolicyRetentionDays) {
		SystemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
	}

	public String getSystemDiskPolicyRetentionLastWeek() {
		return SystemDiskPolicyRetentionLastWeek;
	}

	/**
	 * @param systemDiskPolicyRetentionLastWeek
	 *            系统盘自动快照策略的保留上周日选 项: True:代表保留上周日的快照, False:不保留, 默认值:无,表示保留当前值
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
	 *            数据盘自动快照策略开关: True:该磁盘属性的磁盘打自动快照, False:不打自动快照, 默认值:无,表示保留当前值
	 */
	public void setDataDiskPolicyEnabled(String dataDiskPolicyEnabled) {
		DataDiskPolicyEnabled = dataDiskPolicyEnabled;
	}

	public String getDataDiskPolicyTimePeriod() {
		return DataDiskPolicyTimePeriod;
	}

	/**
	 * @param dataDiskPolicyTimePeriod
	 *            数据盘自动快照策略的时间段: 4 个时间段, 
	 *            1:1:00-7:00 
	 *            2:7:00-13:00 
	 *            3:13:00-19:00
	 *            4:19:00-1:00 
	 *            默认值:无,表示保留当前值
	 */
	public void setDataDiskPolicyTimePeriod(String dataDiskPolicyTimePeriod) {
		DataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
	}

	public String getDataDiskPolicyRetentionDays() {
		return DataDiskPolicyRetentionDays;
	}

	/**
	 * @param dataDiskPolicyRetentionDays
	 *            数据盘自动快照策略的保留天数: 可选值, 1,2,3, 默认值:无,表示保留当前值
	 */
	public void setDataDiskPolicyRetentionDays(
			String dataDiskPolicyRetentionDays) {
		DataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
	}

	public String getDataDiskPolicyRetentionLastWeek() {
		return DataDiskPolicyRetentionLastWeek;
	}

	/**
	 * @param dataDiskPolicyRetentionLastWeek
	 *            数据盘自动快照策略的保留上周日选 项: True:代表保留上周日的快照, False:不保留, 默认值:无,表示保留当前值
	 */
	public void setDataDiskPolicyRetentionLastWeek(
			String dataDiskPolicyRetentionLastWeek) {
		DataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
	}

	@Override
	public String toString() {
		return "ModifyAutoSnapshotPolicyRequest [SystemDiskPolicyEnabled="
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
