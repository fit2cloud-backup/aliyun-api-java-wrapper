package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.AdviceOnExcessIndexes;

public class DescribeOptimizeAdviceOnExcessIndexResponse extends
		PageableResponse {
	private AdviceOnExcessIndexes Items = new AdviceOnExcessIndexes();

	public AdviceOnExcessIndexes getItems() {
		return Items;
	}

	public void setItems(AdviceOnExcessIndexes items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getAdviceOnExcessIndex().addAll(((DescribeOptimizeAdviceOnExcessIndexResponse) response).getItems().getAdviceOnExcessIndex());
	}
}
