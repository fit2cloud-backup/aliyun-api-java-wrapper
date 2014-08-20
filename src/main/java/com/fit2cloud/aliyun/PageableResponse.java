package com.fit2cloud.aliyun;


public class PageableResponse extends Response {

	protected int TotalCount = 0;
	protected int PageNumber;
	protected int PageSize;

	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	public int getPageNumber() {
		return PageNumber;
	}

	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}

	public int getPageSize() {
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}

	public void add(PageableResponse response) {
		if (TotalCount == 0) {
			this.TotalCount = response.getTotalCount();
		}
	}

	@Override
	public String toString() {
		return "PageableResponse [TotalCount=" + TotalCount + ", PageNumber="
				+ PageNumber + ", PageSize=" + PageSize + "]";
	}
}
