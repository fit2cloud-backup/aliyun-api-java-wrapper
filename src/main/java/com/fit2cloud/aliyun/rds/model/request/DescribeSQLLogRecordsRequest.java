package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeSQLLogRecordsRequest extends PageableRequest {
	private String DBInstanceId; 
	private String StartTime; 
	private String EndTime;
	private String QueryKeywords;
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
	public String getQueryKeywords() {
		return QueryKeywords;
	}
	public void setQueryKeywords(String queryKeywords) {
		QueryKeywords = queryKeywords;
	}
}
