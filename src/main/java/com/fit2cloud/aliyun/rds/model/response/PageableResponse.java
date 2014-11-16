package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class PageableResponse extends Response{
	private Integer PageNumber;
	private Integer TotalRecordCount=0; 
	private Integer PageRecordCount;
	public Integer getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		PageNumber = pageNumber;
	}
	public Integer getTotalRecordCount() {
		return TotalRecordCount;
	}
	public void setTotalRecordCount(Integer totalRecordCount) {
		TotalRecordCount = totalRecordCount;
	}
	public Integer getPageRecordCount() {
		return PageRecordCount;
	}
	public void setPageRecordCount(Integer pageRecordCount) {
		PageRecordCount = pageRecordCount;
	} 
	
	public void add(PageableResponse response) {
		if (TotalRecordCount == 0) {
			this.TotalRecordCount = response.getTotalRecordCount();
		}
	}
}
