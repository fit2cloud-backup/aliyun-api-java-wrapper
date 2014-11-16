package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.AdviceOnBigTables;

public class DescribeOptimizeAdviceOnBigTableResponse extends PageableResponse {
	private AdviceOnBigTables Items = new AdviceOnBigTables();

	public AdviceOnBigTables getItems() {
		return Items;
	}

	public void setItems(AdviceOnBigTables items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getAdviceOnBigTable().addAll(((DescribeOptimizeAdviceOnBigTableResponse) response).getItems().getAdviceOnBigTable());
	}
}
