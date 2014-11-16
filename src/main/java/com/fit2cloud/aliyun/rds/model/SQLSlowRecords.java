package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class SQLSlowRecords {
	private List<SQLSlowRecord> SQLSlowRecord = new ArrayList<SQLSlowRecord>();

	public List<SQLSlowRecord> getSQLSlowRecord() {
		return SQLSlowRecord;
	}

	public void setSQLSlowRecord(List<SQLSlowRecord> sQLSlowRecord) {
		SQLSlowRecord = sQLSlowRecord;
	}
}
