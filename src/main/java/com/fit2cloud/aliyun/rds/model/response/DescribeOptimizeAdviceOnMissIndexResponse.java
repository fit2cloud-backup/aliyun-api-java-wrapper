package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.AdviceOnMissIndexes;

public class DescribeOptimizeAdviceOnMissIndexResponse extends PageableResponse {
	private AdviceOnMissIndexes Items = new AdviceOnMissIndexes();

	public AdviceOnMissIndexes getItems() {
		return Items;
	}

	public void setItems(AdviceOnMissIndexes items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getAdviceOnMissIndex().addAll(((DescribeOptimizeAdviceOnMissIndexResponse) response).getItems().getAdviceOnMissIndex());
	}
}
