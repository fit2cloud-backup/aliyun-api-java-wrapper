package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateBackupRequest extends Request {
	private String DBInstanceId; 
	private String BackupMethod; 
	private String BackupType;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getBackupMethod() {
		return BackupMethod;
	}
	public void setBackupMethod(String backupMethod) {
		BackupMethod = backupMethod;
	}
	public String getBackupType() {
		return BackupType;
	}
	public void setBackupType(String backupType) {
		BackupType = backupType;
	}
}
