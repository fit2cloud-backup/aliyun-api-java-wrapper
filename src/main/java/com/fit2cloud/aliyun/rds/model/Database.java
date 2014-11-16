package com.fit2cloud.aliyun.rds.model;


public class Database {
	private String DBName;
	private String DBInstanceId;
	private String Engine;
	private String DBStatus;
	private String CharacterSetName;
	private String DBDescription;
	private AccountPrivilegeInfos Accounts;
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
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
	public String getDBStatus() {
		return DBStatus;
	}
	public void setDBStatus(String dBStatus) {
		DBStatus = dBStatus;
	}
	public String getCharacterSetName() {
		return CharacterSetName;
	}
	public void setCharacterSetName(String characterSetName) {
		CharacterSetName = characterSetName;
	}
	public String getDBDescription() {
		return DBDescription;
	}
	public void setDBDescription(String dBDescription) {
		DBDescription = dBDescription;
	}
	public AccountPrivilegeInfos getAccounts() {
		return Accounts;
	}
	public void setAccounts(AccountPrivilegeInfos accounts) {
		Accounts = accounts;
	}
}
