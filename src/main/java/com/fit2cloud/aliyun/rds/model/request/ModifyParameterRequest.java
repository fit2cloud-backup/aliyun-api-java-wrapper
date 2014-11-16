package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class ModifyParameterRequest extends Request {
	private String DBInstanceId; 
	private String Parameters; 
	private boolean Forcerestart;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getParameters() {
		return Parameters;
	}
	public void setParameters(String parameters) {
		Parameters = parameters;
	}
	public boolean isForcerestart() {
		return Forcerestart;
	}
	public void setForcerestart(boolean forcerestart) {
		Forcerestart = forcerestart;
	}
}
