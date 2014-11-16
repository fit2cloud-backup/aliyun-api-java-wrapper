package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.SQLSlowRecords;

public class DescribeSlowLogRecordsResponse extends PageableResponse {
	private String Engine; 
	private SQLSlowRecords Items = new SQLSlowRecords();
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public SQLSlowRecords getItems() {
		return Items;
	}
	public void setItems(SQLSlowRecords items) {
		Items = items;
	}
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getSQLSlowRecord().addAll(((DescribeSlowLogRecordsResponse) response).getItems().getSQLSlowRecord());
	}
}
