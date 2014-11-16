package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.SQLRecords;

public class DescribeSQLLogRecordsResponse extends PageableResponse {
	private SQLRecords Items = new SQLRecords();

	public SQLRecords getItems() {
		return Items;
	}

	public void setItems(SQLRecords items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getSQLRecord().addAll(((DescribeSQLLogRecordsResponse) response).getItems().getSQLRecord());
	}
}
