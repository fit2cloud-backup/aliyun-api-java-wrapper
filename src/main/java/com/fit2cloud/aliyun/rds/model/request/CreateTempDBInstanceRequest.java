package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateTempDBInstanceRequest extends Request {
	private String DBInstanceId; 
	private Integer BackupId; 
	private String RestoreTime;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public Integer getBackupId() {
		return BackupId;
	}
	public void setBackupId(Integer backupId) {
		BackupId = backupId;
	}
	public String getRestoreTime() {
		return RestoreTime;
	}
	public void setRestoreTime(String restoreTime) {
		RestoreTime = restoreTime;
	} 
}
