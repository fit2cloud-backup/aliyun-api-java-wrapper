package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class DescribeResourceUsageResponse extends Response {
	private String DBInstanceId; 
	private String Engine; 
	private long DiskUsed; 
	private long DataSize;
	private long LogSize;
	private long BackupSize;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public long getDiskUsed() {
		return DiskUsed;
	}
	public void setDiskUsed(long diskUsed) {
		DiskUsed = diskUsed;
	}
	public long getDataSize() {
		return DataSize;
	}
	public void setDataSize(long dataSize) {
		DataSize = dataSize;
	}
	public long getLogSize() {
		return LogSize;
	}
	public void setLogSize(long logSize) {
		LogSize = logSize;
	}
	public long getBackupSize() {
		return BackupSize;
	}
	public void setBackupSize(long backupSize) {
		BackupSize = backupSize;
	}
}
