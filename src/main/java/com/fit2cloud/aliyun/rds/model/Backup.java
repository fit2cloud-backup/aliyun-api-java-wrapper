package com.fit2cloud.aliyun.rds.model;

public class Backup {
	private Integer BackupId; 
	private String DBInstanceId; 
	private String BackupStatus; 
	private String BackupStartTime;
	private String BackupEndTime;
	private String BackupType;
	private String BackupMode;
	private String BackupMethod;
	private String BackupDownloadURL; 
	private Long BackupSize;
	public Integer getBackupId() {
		return BackupId;
	}
	public void setBackupId(Integer backupId) {
		BackupId = backupId;
	}
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getBackupStatus() {
		return BackupStatus;
	}
	public void setBackupStatus(String backupStatus) {
		BackupStatus = backupStatus;
	}
	public String getBackupStartTime() {
		return BackupStartTime;
	}
	public void setBackupStartTime(String backupStartTime) {
		BackupStartTime = backupStartTime;
	}
	public String getBackupEndTime() {
		return BackupEndTime;
	}
	public void setBackupEndTime(String backupEndTime) {
		BackupEndTime = backupEndTime;
	}
	public String getBackupType() {
		return BackupType;
	}
	public void setBackupType(String backupType) {
		BackupType = backupType;
	}
	public String getBackupMode() {
		return BackupMode;
	}
	public void setBackupMode(String backupMode) {
		BackupMode = backupMode;
	}
	public String getBackupMethod() {
		return BackupMethod;
	}
	public void setBackupMethod(String backupMethod) {
		BackupMethod = backupMethod;
	}
	public String getBackupDownloadURL() {
		return BackupDownloadURL;
	}
	public void setBackupDownloadURL(String backupDownloadURL) {
		BackupDownloadURL = backupDownloadURL;
	}
	public Long getBackupSize() {
		return BackupSize;
	}
	public void setBackupSize(Long backupSize) {
		BackupSize = backupSize;
	} 
}
