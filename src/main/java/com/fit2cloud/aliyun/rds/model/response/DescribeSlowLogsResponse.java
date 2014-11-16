package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.SQLSlowLogs;

public class DescribeSlowLogsResponse extends PageableResponse {
	private String Engine; 
	private String StartTime; 
	private String EndTime;
	private SQLSlowLogs Items = new SQLSlowLogs();
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
	public SQLSlowLogs getItems() {
		return Items;
	}
	public void setItems(SQLSlowLogs items) {
		Items = items;
	} 
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getSQLSlowLog().addAll(((DescribeSlowLogsResponse) response).getItems().getSQLSlowLog());
	}
}
