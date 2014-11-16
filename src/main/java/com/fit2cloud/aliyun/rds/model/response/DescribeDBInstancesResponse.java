package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.DBInstances;

public class DescribeDBInstancesResponse extends PageableResponse {
	private DBInstances Items = new DBInstances();

	public DBInstances getItems() {
		return Items;
	}

	public void setItems(DBInstances items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getDBInstance().addAll(((DescribeDBInstancesResponse) response).getItems().getDBInstance());
	}
}
