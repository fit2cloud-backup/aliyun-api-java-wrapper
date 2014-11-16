package com.fit2cloud.aliyun.rds.model;

public class AdviceOnExcessIndex {
	private String DBName; 
	private String TableName; 
	private Integer IndexCount;
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
	public Integer getIndexCount() {
		return IndexCount;
	}
	public void setIndexCount(Integer indexCount) {
		IndexCount = indexCount;
	}
}
