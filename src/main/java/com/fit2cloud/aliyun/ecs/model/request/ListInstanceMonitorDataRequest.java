package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class ListInstanceMonitorDataRequest extends Request {
	// required
	private String InstanceId;
	private String StartTime;
	private String EndTime;
	
	// other fields
	private Integer Period;

	/**
	 * @param instanceId
	 * @param startTime
	 *            获取数据的起始时间点: ISO8601 表示 法,并使用 UTC 时间。格式 为:
	 *            YYYY-MM-DDThh:mm:ssZ。如果秒 不是 00,则自动取为下一分钟开始时
	 * @param endTime
	 *            获取数据的结束时间点: ISO8601 表示 法,并使用 UTC 时间。格式 为:
	 *            YYYY-MM-DDThh:mm:ssZ。如果秒 不是 00,则自动取为下一分钟开始时
	 */
	public ListInstanceMonitorDataRequest(String instanceId, String startTime,
			String endTime) {
		InstanceId = instanceId;
		StartTime = startTime;
		EndTime = endTime;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	/**
	 * @param instanceId
	 *            指定监控的实例 ID
	 */
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getStartTime() {
		return StartTime;
	}

	/**
	 * @param startTime
	 *            获取数据的起始时间点: ISO8601 表示 法,并使用 UTC 时间。格式 为:
	 *            YYYY-MM-DDThh:mm:ssZ。如果秒 不是 00,则自动取为下一分钟开始时
	 */
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	/**
	 * @param endTime
	 *            获取数据的结束时间点: ISO8601 表示 法,并使用 UTC 时间。格式 为:
	 *            YYYY-MM-DDThh:mm:ssZ。如果秒 不是 00,则自动取为下一分钟开始时
	 */
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public Integer getPeriod() {
		return Period;
	}

	/**
	 * @param period
	 *            获取监控数据的精度,默认 60 秒,只 能为 60 的倍数。
	 */
	public void setPeriod(Integer period) {
		Period = period;
	}

	@Override
	public String toString() {
		return "ListInstanceMonitorDataRequest [InstanceId=" + InstanceId
				+ ", StartTime=" + StartTime + ", EndTime=" + EndTime
				+ ", Period=" + Period + "]";
	}

}
