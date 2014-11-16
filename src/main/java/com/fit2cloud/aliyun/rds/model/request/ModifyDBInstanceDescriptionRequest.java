package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyDBInstanceDescriptionRequest extends Request {
	private String DBInstanceId;
	private String DBInstanceDescription;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getDBInstanceDescription() {
		return DBInstanceDescription;
	}
	public void setDBInstanceDescription(String dBInstanceDescription) {
		DBInstanceDescription = dBInstanceDescription;
	}
}
