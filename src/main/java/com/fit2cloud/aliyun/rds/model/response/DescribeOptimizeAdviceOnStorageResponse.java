package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.AdviceOnStorages;

public class DescribeOptimizeAdviceOnStorageResponse extends PageableResponse {
	private AdviceOnStorages Items = new AdviceOnStorages();

	public AdviceOnStorages getItems() {
		return Items;
	}

	public void setItems(AdviceOnStorages items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getAdviceOnStorage().addAll(((DescribeOptimizeAdviceOnStorageResponse) response).getItems().getAdviceOnStorage());
	}
}
