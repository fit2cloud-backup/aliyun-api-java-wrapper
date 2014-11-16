package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeOptimizeAdviceOnStorageRequest extends PageableRequest {
	private String DBInstanceId;

	public String getDBInstanceId() {
		return DBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
}
