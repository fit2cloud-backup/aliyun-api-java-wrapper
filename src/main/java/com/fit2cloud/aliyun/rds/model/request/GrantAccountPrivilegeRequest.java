package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;


public class GrantAccountPrivilegeRequest extends Request {
	private String DBInstanceId;
	private String AccountName;
	private String DBName;
	private String AccountPrivilege;
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
