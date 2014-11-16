package com.fit2cloud.aliyun.rds.model;

public class SQLSlowRecord {
	private String HostAddress; 
	private String DBName;
	private String SQLText;
	private Long QueryTimes;
	private Long LockTimes;
	private Long ParseRowCounts;
	private Long ReturnRowCounts;
	private String ExecutionStartTime;
	public String getHostAddress() {
		return HostAddress;
	}
	public void setHostAddress(String hostAddress) {
		HostAddress = hostAddress;
	}
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getSQLText() {
		return SQLText;
	}
	public void setSQLText(String sQLText) {
		SQLText = sQLText;
	}
	public Long getQueryTimes() {
		return QueryTimes;
	}
	public void setQueryTimes(Long queryTimes) {
		QueryTimes = queryTimes;
	}
	public Long getLockTimes() {
		return LockTimes;
	}
	public void setLockTimes(Long lockTimes) {
		LockTimes = lockTimes;
	}
	public Long getParseRowCounts() {
		return ParseRowCounts;
	}
	public void setParseRowCounts(Long parseRowCounts) {
		ParseRowCounts = parseRowCounts;
	}
	public Long getReturnRowCounts() {
		return ReturnRowCounts;
	}
	public void setReturnRowCounts(Long returnRowCounts) {
		ReturnRowCounts = returnRowCounts;
	}
	public String getExecutionStartTime() {
		return ExecutionStartTime;
	}
	public void setExecutionStartTime(String executionStartTime) {
		ExecutionStartTime = executionStartTime;
	}
}
