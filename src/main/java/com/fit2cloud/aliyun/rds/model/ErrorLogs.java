package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogs {
	private List<ErrorLog> ErrorLog = new ArrayList<ErrorLog>();

	public List<ErrorLog> getErrorLog() {
		return ErrorLog;
	}

	public void setErrorLog(List<ErrorLog> errorLog) {
		ErrorLog = errorLog;
	}
}
