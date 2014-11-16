package com.fit2cloud.aliyun.rds.model;

public class AdviceOnMissIndex {
	private String DBName; 
	private String TableName; 
	private String QueryColumn; 
	private String SQLText;
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
	public String getQueryColumn() {
		return QueryColumn;
	}
	public void setQueryColumn(String queryColumn) {
		QueryColumn = queryColumn;
	}
	public String getSQLText() {
		return SQLText;
	}
	public void setSQLText(String sQLText) {
		SQLText = sQLText;
	}
}
