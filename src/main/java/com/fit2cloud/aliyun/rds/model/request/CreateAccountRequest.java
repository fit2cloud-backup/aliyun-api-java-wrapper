package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateAccountRequest extends Request {
	private String DBInstanceId;
	private String AccountName;
	private String AccountPassword;
	private String AccountDescription;
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
	public String getAccountPassword() {
		return AccountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		AccountPassword = accountPassword;
	}
	public String getAccountDescription() {
		return AccountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		AccountDescription = accountDescription;
	}
}
