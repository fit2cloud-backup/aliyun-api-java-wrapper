package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeSlowLogsRequest extends PageableRequest {
	private String DBInstanceId; 
	private String StartTime; 
	private String EndTime;
	private String DBName; 
	private String SortKey;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
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
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getSortKey() {
		return SortKey;
	}
	public void setSortKey(String sortKey) {
		SortKey = sortKey;
	} 
}
