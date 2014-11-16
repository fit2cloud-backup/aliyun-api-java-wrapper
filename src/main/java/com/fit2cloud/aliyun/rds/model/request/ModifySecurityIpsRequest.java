package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifySecurityIpsRequest extends Request {
	private String DBInstanceId;
	private String SecurityIps;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getSecurityIps() {
		return SecurityIps;
	}
	public void setSecurityIps(String securityIps) {
		SecurityIps = securityIps;
	}
}
