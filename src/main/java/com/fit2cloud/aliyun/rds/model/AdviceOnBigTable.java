package com.fit2cloud.aliyun.rds.model;

public class AdviceOnBigTable {
	private String DBName; 
	private String TableName; 
	private Long TableSize; 
	private Long DataSize; 
	private Long IndexSize;
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
	public Long getTableSize() {
		return TableSize;
	}
	public void setTableSize(Long tableSize) {
		TableSize = tableSize;
	}
	public Long getDataSize() {
		return DataSize;
	}
	public void setDataSize(Long dataSize) {
		DataSize = dataSize;
	}
	public Long getIndexSize() {
		return IndexSize;
	}
	public void setIndexSize(Long indexSize) {
		IndexSize = indexSize;
	}
}
