package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.AdviceOnMissPKs;

public class DescribeOptimizeAdviceOnMissPKResponse extends PageableResponse {
	private AdviceOnMissPKs Items = new AdviceOnMissPKs();

	public AdviceOnMissPKs getItems() {
		return Items;
	}

	public void setItems(AdviceOnMissPKs items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getAdviceOnMissPK().addAll(((DescribeOptimizeAdviceOnMissPKResponse) response).getItems().getAdviceOnMissPK());
	}
}
