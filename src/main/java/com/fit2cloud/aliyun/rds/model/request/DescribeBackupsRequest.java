package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeBackupsRequest extends PageableRequest {
	private String DBInstanceId; 
	private Integer BackupId; 
	private String BackupStatus; 
	private String BackupMode;
	private String StartTime;
	private String EndTime;
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
	public String getBackupStatus() {
		return BackupStatus;
	}
	public void setBackupStatus(String backupStatus) {
		BackupStatus = backupStatus;
	}
	public String getBackupMode() {
		return BackupMode;
	}
	public void setBackupMode(String backupMode) {
		BackupMode = backupMode;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
}
