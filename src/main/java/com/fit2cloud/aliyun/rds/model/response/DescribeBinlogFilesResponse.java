package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.BinLogFiles;

public class DescribeBinlogFilesResponse extends PageableResponse {
	private BinLogFiles Items = new BinLogFiles();

	public BinLogFiles getItems() {
		return Items;
	}

	public void setItems(BinLogFiles items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getBinLogFile().addAll(((DescribeBinlogFilesResponse) response).getItems().getBinLogFile());
	}
}
