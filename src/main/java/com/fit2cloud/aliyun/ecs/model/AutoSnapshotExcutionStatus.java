package com.fit2cloud.aliyun.ecs.model;

public class AutoSnapshotExcutionStatus {
	private String SystemDiskExcutionStatus;
	private String DataDiskExcutionStatus;

	public String getSystemDiskExcutionStatus() {
		return SystemDiskExcutionStatus;
	}

	/**
	 * @param systemDiskExcutionStatus
	 *            返回最近一次执行的状态: Standby|Executed|Failed
	 *            Standby:刚设置完成还未开始执行或者系统盘和数据盘的策略都关闭 Executed:执行成功 Failed:执行失败
	 */
	public void setSystemDiskExcutionStatus(String systemDiskExcutionStatus) {
		SystemDiskExcutionStatus = systemDiskExcutionStatus;
	}

	public String getDataDiskExcutionStatus() {
		return DataDiskExcutionStatus;
	}

	/**
	 * @param dataDiskExcutionStatus
	 *            返回最近一次执行的状态: Standby|Excuted|Failed Standby:刚设置完成还未开始执行或者系统
	 *            盘和数据盘的策略都关闭 Executed:执行成功 Failed:执行失败
	 */
	public void setDataDiskExcutionStatus(String dataDiskExcutionStatus) {
		DataDiskExcutionStatus = dataDiskExcutionStatus;
	}

	@Override
	public String toString() {
		return "AutoSnapshotExcutionStatus [SystemDiskExcutionStatus="
				+ SystemDiskExcutionStatus + ", DataDiskExcutionStatus="
				+ DataDiskExcutionStatus + "]";
	}
}
