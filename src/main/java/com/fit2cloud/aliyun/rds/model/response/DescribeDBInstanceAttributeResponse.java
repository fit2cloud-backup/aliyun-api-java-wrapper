package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.DBInstanceAttributes;

public class DescribeDBInstanceAttributeResponse extends Response {
	private DBInstanceAttributes Items = new DBInstanceAttributes();

	public DBInstanceAttributes getItems() {
		return Items;
	}

	public void setItems(DBInstanceAttributes items) {
		Items = items;
	}
}
