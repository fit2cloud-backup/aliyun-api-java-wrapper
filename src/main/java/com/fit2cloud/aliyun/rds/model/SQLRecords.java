package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class SQLRecords {
	private List<SQLRecord> SQLRecord = new ArrayList<SQLRecord>();

	public List<SQLRecord> getSQLRecord() {
		return SQLRecord;
	}

	public void setSQLRecord(List<SQLRecord> sQLRecord) {
		SQLRecord = sQLRecord;
	}
}
