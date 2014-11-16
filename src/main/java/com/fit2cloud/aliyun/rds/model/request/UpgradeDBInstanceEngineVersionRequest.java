package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class UpgradeDBInstanceEngineVersionRequest extends Request {
	private String DBInstanceId;
	private String EngineVersion;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getEngineVersion() {
		return EngineVersion;
	}
	public void setEngineVersion(String engineVersion) {
		EngineVersion = engineVersion;
	}
}
