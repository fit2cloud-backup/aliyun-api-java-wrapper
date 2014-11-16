package com.fit2cloud.aliyun.rds.model;

public class SQLReport {
	private String SQLText; 
	private String TotalExecutionCounts;
	private String TotalExecutionTimes;
	private String ReturnTotalRowCounts;
	public String getSQLText() {
		return SQLText;
	}
	public void setSQLText(String sQLText) {
		SQLText = sQLText;
	}
	public String getTotalExecutionCounts() {
		return TotalExecutionCounts;
	}
	public void setTotalExecutionCounts(String totalExecutionCounts) {
		TotalExecutionCounts = totalExecutionCounts;
	}
	public String getTotalExecutionTimes() {
		return TotalExecutionTimes;
	}
	public void setTotalExecutionTimes(String totalExecutionTimes) {
		TotalExecutionTimes = totalExecutionTimes;
	}
	public String getReturnTotalRowCounts() {
		return ReturnTotalRowCounts;
	}
	public void setReturnTotalRowCounts(String returnTotalRowCounts) {
		ReturnTotalRowCounts = returnTotalRowCounts;
	}
}
