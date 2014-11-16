package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyDBInstanceSpecRequest extends Request {
	private String DBInstanceId;
	private String PayType;
	private String DBInstanceClass;
	private Integer DBInstanceStorage;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getPayType() {
		return PayType;
	}
	public void setPayType(String payType) {
		PayType = payType;
	}
	public String getDBInstanceClass() {
		return DBInstanceClass;
	}
	public void setDBInstanceClass(String dBInstanceClass) {
		DBInstanceClass = dBInstanceClass;
	}
	public Integer getDBInstanceStorage() {
		return DBInstanceStorage;
	}
	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		DBInstanceStorage = dBInstanceStorage;
	}
}
