package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyBackupPolicyRequest extends Request {
	private String DBInstanceId;
	private String PreferredBackupTime;
	private String PreferredBackupPeriod;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getPreferredBackupTime() {
		return PreferredBackupTime;
	}
	public void setPreferredBackupTime(String preferredBackupTime) {
		PreferredBackupTime = preferredBackupTime;
	}
	public String getPreferredBackupPeriod() {
		return PreferredBackupPeriod;
	}
	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		PreferredBackupPeriod = preferredBackupPeriod;
	}
}
