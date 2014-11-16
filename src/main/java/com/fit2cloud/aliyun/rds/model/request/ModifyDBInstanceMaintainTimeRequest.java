package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyDBInstanceMaintainTimeRequest extends Request {
	private String DBInstanceId;
	private String MaintainTime;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getMaintainTime() {
		return MaintainTime;
	}
	public void setMaintainTime(String maintainTime) {
		MaintainTime = maintainTime;
	}
}
