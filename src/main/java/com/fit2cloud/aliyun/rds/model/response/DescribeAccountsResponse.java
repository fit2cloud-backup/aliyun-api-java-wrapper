package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.DBInstanceAccounts;
public class DescribeAccountsResponse extends Response {
	private DBInstanceAccounts Accounts;

	public DBInstanceAccounts getAccounts() {
		return Accounts;
	}

	public void setAccounts(DBInstanceAccounts accounts) {
		Accounts = accounts;
	}
}
