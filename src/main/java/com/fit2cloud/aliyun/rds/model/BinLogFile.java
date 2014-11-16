package com.fit2cloud.aliyun.rds.model;

public class BinLogFile {
	private Long FileSize; 
	private String LogBeginTime; 
	private String LogEndTime; 
	private String DownloadLink; 
	private String LinkExpiredTime;
	public Long getFileSize() {
		return FileSize;
	}
	public void setFileSize(Long fileSize) {
		FileSize = fileSize;
	}
	public String getLogBeginTime() {
		return LogBeginTime;
	}
	public void setLogBeginTime(String logBeginTime) {
		LogBeginTime = logBeginTime;
	}
	public String getLogEndTime() {
		return LogEndTime;
	}
	public void setLogEndTime(String logEndTime) {
		LogEndTime = logEndTime;
	}
	public String getDownloadLink() {
		return DownloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		DownloadLink = downloadLink;
	}
	public String getLinkExpiredTime() {
		return LinkExpiredTime;
	}
	public void setLinkExpiredTime(String linkExpiredTime) {
		LinkExpiredTime = linkExpiredTime;
	}
}
