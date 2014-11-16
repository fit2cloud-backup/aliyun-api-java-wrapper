package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class CreateDBInstanceResponse extends Response {
	private String DBInstanceId; 
	private String OrderId;
	private String ConnectionString;
	private String Port;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getConnectionString() {
		return ConnectionString;
	}
	public void setConnectionString(String connectionString) {
		ConnectionString = connectionString;
	}
	public String getPort() {
		return Port;
	}
	public void setPort(String port) {
		Port = port;
	}
}
