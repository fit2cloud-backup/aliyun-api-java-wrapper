package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class CreateTempDBInstanceResponse extends Response {
	private String TempDBInstanceId;

	public String getTempDBInstanceId() {
		return TempDBInstanceId;
	}

	public void setTempDBInstanceId(String tempDBInstanceId) {
		TempDBInstanceId = tempDBInstanceId;
	}
}
