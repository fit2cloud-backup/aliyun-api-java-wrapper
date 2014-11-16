package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class DeleteDatabaseRequest extends Request {
	private String DBInstanceId;
	private String DBName;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
}
