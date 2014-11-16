package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class SQLReports {
	private List<SQLReport> SQLReport = new ArrayList<SQLReport>();

	public List<SQLReport> getSQLReport() {
		return SQLReport;
	}

	public void setSQLReport(List<SQLReport> sQLReport) {
		SQLReport = sQLReport;
	}
}
