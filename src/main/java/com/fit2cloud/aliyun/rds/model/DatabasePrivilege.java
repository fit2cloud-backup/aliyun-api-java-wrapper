package com.fit2cloud.aliyun.rds.model;

public class DatabasePrivilege {
	private String DBName; 
	private String AccountPrivilege;
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getAccountPrivilege() {
		return AccountPrivilege;
	}
	public void setAccountPrivilege(String accountPrivilege) {
		AccountPrivilege = accountPrivilege;
	} 
}
