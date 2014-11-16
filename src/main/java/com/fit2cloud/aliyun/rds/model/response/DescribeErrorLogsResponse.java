package com.fit2cloud.aliyun.rds.model.response;
import com.fit2cloud.aliyun.rds.model.ErrorLogs;

public class DescribeErrorLogsResponse extends PageableResponse {
	private ErrorLogs Items = new ErrorLogs();

	public ErrorLogs getItems() {
		return Items;
	}

	public void setItems(ErrorLogs items) {
		Items = items;
	}
	
	public void add(PageableResponse response) {
		super.add(response);
		getItems().getErrorLog().addAll(((DescribeErrorLogsResponse) response).getItems().getErrorLog());
	}
}
