package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.SQLReports;

public class DescribeSQLLogReportsResponse extends PageableResponse {
	private SQLReports Items = new SQLReports();

	public SQLReports getItems() {
		return Items;
	}

	public void setItems(SQLReports items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getSQLReport().addAll(((DescribeSQLLogReportsResponse) response).getItems().getSQLReport());
	}
}
