package com.fit2cloud.aliyun;


public class PageableRequest extends Request {

	protected Integer PageNumber;
	protected Integer PageSize;

	public Integer getPageNumber() {
		return PageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		PageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

}
