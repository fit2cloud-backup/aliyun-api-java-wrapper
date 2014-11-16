package com.fit2cloud.aliyun.rds.model;

public class SQLRecord {
	private String DBName; 
	private String AccountName; 
	private String HostAddress; 
	private String SQLText; 
	private Long TotalExecutionTimes;
	private Long ReturnRowCounts; 
	private String ExecuteTime;
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public String getHostAddress() {
		return HostAddress;
	}
	public void setHostAddress(String hostAddress) {
		HostAddress = hostAddress;
	}
	public String getSQLText() {
		return SQLText;
	}
	public void setSQLText(String sQLText) {
		SQLText = sQLText;
	}
	public Long getTotalExecutionTimes() {
		return TotalExecutionTimes;
	}
	public void setTotalExecutionTimes(Long totalExecutionTimes) {
		TotalExecutionTimes = totalExecutionTimes;
	}
	public Long getReturnRowCounts() {
		return ReturnRowCounts;
	}
	public void setReturnRowCounts(Long returnRowCounts) {
		ReturnRowCounts = returnRowCounts;
	}
	public String getExecuteTime() {
		return ExecuteTime;
	}
	public void setExecuteTime(String executeTime) {
		ExecuteTime = executeTime;
	} 
}
