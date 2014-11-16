package com.fit2cloud.aliyun.rds.model;

public class DBInstance {
	private String DBInstanceId;
	private String DBInstanceDescription;
	private String PayType;
	private String DBInstanceType;
	private String RegionId;
	private String ExpireTime;
	private String DBInstanceStatus;
	private String Engine;
	private String DBInstanceNetType;
	private String LockMode;
	private String LockReason;
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
	public String getPayType() {
		return PayType;
	}
	public void setPayType(String payType) {
		PayType = payType;
	}
	public String getDBInstanceType() {
		return DBInstanceType;
	}
	public void setDBInstanceType(String dBInstanceType) {
		DBInstanceType = dBInstanceType;
	}
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getExpireTime() {
		return ExpireTime;
	}
	public void setExpireTime(String expireTime) {
		ExpireTime = expireTime;
	}
	public String getDBInstanceStatus() {
		return DBInstanceStatus;
	}
	public void setDBInstanceStatus(String dBInstanceStatus) {
		DBInstanceStatus = dBInstanceStatus;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getDBInstanceNetType() {
		return DBInstanceNetType;
	}
	public void setDBInstanceNetType(String dBInstanceNetType) {
		DBInstanceNetType = dBInstanceNetType;
	}
	public String getLockMode() {
		return LockMode;
	}
	public void setLockMode(String lockMode) {
		LockMode = lockMode;
	}
	public String getLockReason() {
		return LockReason;
	}
	public void setLockReason(String lockReason) {
		LockReason = lockReason;
	}
}
