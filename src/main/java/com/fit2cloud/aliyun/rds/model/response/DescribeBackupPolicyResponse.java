package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class DescribeBackupPolicyResponse extends Response {
	private Integer BackupRetentionPeriod; 
	private String PreferredBackupTime; 
	private String PreferredBackupPeriod;
	public Integer getBackupRetentionPeriod() {
		return BackupRetentionPeriod;
	}
	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		BackupRetentionPeriod = backupRetentionPeriod;
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
