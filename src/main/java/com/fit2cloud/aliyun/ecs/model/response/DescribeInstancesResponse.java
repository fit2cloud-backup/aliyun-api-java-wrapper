package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.InstanceAttributesType;

public class DescribeInstancesResponse extends PageableResponse {
	private InstanceAttributesType Instances = new InstanceAttributesType();

	public InstanceAttributesType getInstances() {
		return Instances;
	}

	public void setInstances(InstanceAttributesType instances) {
		Instances = instances;
	}

	public void add(PageableResponse response) {
		super.add(response);
		getInstances().getInstance()
				.addAll(((DescribeInstancesResponse) response).getInstances().getInstance());
	}

	@Override
	public String toString() {
		return "DescribeInstancesResponse [Instances=" + Instances
				+ ", TotalCount=" + TotalCount + ", PageNumber=" + PageNumber
				+ ", PageSize=" + PageSize + ", RequestId=" + RequestId + "]";
	}
}
