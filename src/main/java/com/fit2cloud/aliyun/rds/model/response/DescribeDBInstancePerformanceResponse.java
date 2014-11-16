package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.PerformanceKeys;

public class DescribeDBInstancePerformanceResponse extends Response {
	private String DBInstanceId; 
	private String Engine; 
	private String StartTime; 
	private String EndTime;
	private PerformanceKeys PerformanceKeys;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public PerformanceKeys getPerformanceKeys() {
		return PerformanceKeys;
	}
	public void setPerformanceKeys(PerformanceKeys performanceKeys) {
		PerformanceKeys = performanceKeys;
	}

}
