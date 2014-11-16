package com.fit2cloud.aliyun.rds.model;

public class SQLSlowLog {
	private String SQLText;
	
	private String DBName; 
	private Long MySQLTotalExecutionCounts;
	private Long MySQLTotalExecutionTimes;
	private Long MaxExecutionTime;
	private Long TotalLockTimes;
	private Long MaxLockTime;
	private Long ParseTotalRowCounts;
	private Long ParseMaxRowCount;
	private Long ReturnTotalRowCounts;
	private Long ReturnMaxRowCount;
	private String CreateTime;
	
	private Long SQLServerTotalExecutionCounts;
	private Long SQLServerTotalExecutionTimes;
	private Long TotalLogicalReadcounts;
	private Long TotalPhysicalReadcounts;
	private String ReportTime;
	public String getSQLText() {
		return SQLText;
	}
	public void setSQLText(String sQLText) {
		SQLText = sQLText;
	}
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public Long getMySQLTotalExecutionCounts() {
		return MySQLTotalExecutionCounts;
	}
	public void setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
		MySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
	}
	public Long getMySQLTotalExecutionTimes() {
		return MySQLTotalExecutionTimes;
	}
	public void setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
		MySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
	}
	public Long getMaxExecutionTime() {
		return MaxExecutionTime;
	}
	public void setMaxExecutionTime(Long maxExecutionTime) {
		MaxExecutionTime = maxExecutionTime;
	}
	public Long getTotalLockTimes() {
		return TotalLockTimes;
	}
	public void setTotalLockTimes(Long totalLockTimes) {
		TotalLockTimes = totalLockTimes;
	}
	public Long getMaxLockTime() {
		return MaxLockTime;
	}
	public void setMaxLockTime(Long maxLockTime) {
		MaxLockTime = maxLockTime;
	}
	public Long getParseTotalRowCounts() {
		return ParseTotalRowCounts;
	}
	public void setParseTotalRowCounts(Long parseTotalRowCounts) {
		ParseTotalRowCounts = parseTotalRowCounts;
	}
	public Long getParseMaxRowCount() {
		return ParseMaxRowCount;
	}
	public void setParseMaxRowCount(Long parseMaxRowCount) {
		ParseMaxRowCount = parseMaxRowCount;
	}
	public Long getReturnTotalRowCounts() {
		return ReturnTotalRowCounts;
	}
	public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
		ReturnTotalRowCounts = returnTotalRowCounts;
	}
	public Long getReturnMaxRowCount() {
		return ReturnMaxRowCount;
	}
	public void setReturnMaxRowCount(Long returnMaxRowCount) {
		ReturnMaxRowCount = returnMaxRowCount;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public Long getSQLServerTotalExecutionCounts() {
		return SQLServerTotalExecutionCounts;
	}
	public void setSQLServerTotalExecutionCounts(Long sQLServerTotalExecutionCounts) {
		SQLServerTotalExecutionCounts = sQLServerTotalExecutionCounts;
	}
	public Long getSQLServerTotalExecutionTimes() {
		return SQLServerTotalExecutionTimes;
	}
	public void setSQLServerTotalExecutionTimes(Long sQLServerTotalExecutionTimes) {
		SQLServerTotalExecutionTimes = sQLServerTotalExecutionTimes;
	}
	public Long getTotalLogicalReadcounts() {
		return TotalLogicalReadcounts;
	}
	public void setTotalLogicalReadcounts(Long totalLogicalReadcounts) {
		TotalLogicalReadcounts = totalLogicalReadcounts;
	}
	public Long getTotalPhysicalReadcounts() {
		return TotalPhysicalReadcounts;
	}
	public void setTotalPhysicalReadcounts(Long totalPhysicalReadcounts) {
		TotalPhysicalReadcounts = totalPhysicalReadcounts;
	}
	public String getReportTime() {
		return ReportTime;
	}
	public void setReportTime(String reportTime) {
		ReportTime = reportTime;
	}
}
