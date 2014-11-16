package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.rds.model.Backups;

public class DescribeBackupsResponse extends PageableResponse {
	private Backups Items = new Backups();

	public Backups getItems() {
		return Items;
	}

	public void setItems(Backups items) {
		Items = items;
	} 
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getBackup().addAll(((DescribeBackupsResponse) response).getItems().getBackup());
	}
}
