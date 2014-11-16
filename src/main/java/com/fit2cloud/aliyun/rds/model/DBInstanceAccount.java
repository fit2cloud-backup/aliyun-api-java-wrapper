package com.fit2cloud.aliyun.rds.model;


public class DBInstanceAccount {
	private String DBInstanceId; 
	private String AccountName; 
	private String AccountStatus; 
	private String AccountDescription; 
	private DatabasePrivileges DatabasePrivileges;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	public String getAccountDescription() {
		return AccountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		AccountDescription = accountDescription;
	}
	public DatabasePrivileges getDatabasePrivileges() {
		return DatabasePrivileges;
	}
	public void setDatabasePrivileges(DatabasePrivileges databasePrivileges) {
		DatabasePrivileges = databasePrivileges;
	}
}
