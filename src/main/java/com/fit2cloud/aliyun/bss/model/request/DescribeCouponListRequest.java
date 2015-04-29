package com.fit2cloud.aliyun.bss.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeCouponListRequest extends PageableRequest {
	
	private String Status = "Enable";

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public DescribeCouponListRequest() {
	}
	
}
