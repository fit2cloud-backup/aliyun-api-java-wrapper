package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class SwitchDBInstanceNetTypeRequest extends Request {
	private String DBInstanceId;
	private String ConnectionStringPrefix;
	private Integer Port;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getConnectionStringPrefix() {
		return ConnectionStringPrefix;
	}
	public void setConnectionStringPrefix(String connectionStringPrefix) {
		ConnectionStringPrefix = connectionStringPrefix;
	}
	public Integer getPort() {
		return Port;
	}
	public void setPort(Integer port) {
		Port = port;
	}
}
