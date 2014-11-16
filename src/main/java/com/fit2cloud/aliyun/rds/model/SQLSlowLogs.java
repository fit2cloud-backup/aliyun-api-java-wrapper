package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class SQLSlowLogs {
	private List<SQLSlowLog> SQLSlowLog = new ArrayList<SQLSlowLog>();

	public List<SQLSlowLog> getSQLSlowLog() {
		return SQLSlowLog;
	}

	public void setSQLSlowLog(List<SQLSlowLog> sQLSlowLog) {
		SQLSlowLog = sQLSlowLog;
	}
}
