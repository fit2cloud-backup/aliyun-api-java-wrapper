package com.fit2cloud.aliyun.rds.model;

public class AdviceOnStorage {
	private String DBName;
	private String TableName;
	private String CurrentEngine; 
	private String AdviseEngine;
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public String getCurrentEngine() {
		return CurrentEngine;
	}
	public void setCurrentEngine(String currentEngine) {
		CurrentEngine = currentEngine;
	}
	public String getAdviseEngine() {
		return AdviseEngine;
	}
	public void setAdviseEngine(String adviseEngine) {
		AdviseEngine = adviseEngine;
	} 
}
