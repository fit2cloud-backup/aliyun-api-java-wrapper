package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class DescribeResourceUsageResponse extends Response {
	private String DBInstanceId; 
	private String Engine; 
	private Integer DiskUsed; 
	private Integer DataSize;
	private Integer LogSize;
	private Integer BackupSize;
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
	public Integer getDiskUsed() {
		return DiskUsed;
	}
	public void setDiskUsed(Integer diskUsed) {
		DiskUsed = diskUsed;
	}
	public Integer getDataSize() {
		return DataSize;
	}
	public void setDataSize(Integer dataSize) {
		DataSize = dataSize;
	}
	public Integer getLogSize() {
		return LogSize;
	}
	public void setLogSize(Integer logSize) {
		LogSize = logSize;
	}
	public Integer getBackupSize() {
		return BackupSize;
	}
	public void setBackupSize(Integer backupSize) {
		BackupSize = backupSize;
	} 
}
