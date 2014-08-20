package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.InstanceTypes;

public class ListInstanceTypeResponse extends Response {
	private InstanceTypes InstanceTypes;

	public InstanceTypes getInstanceTypes() {
		return InstanceTypes;
	}

	@Override
	public String toString() {
		return "ListInstanceTypeResponse [InstanceTypes=" + InstanceTypes
				+ ", RequestId=" + RequestId + "]";
	}

}
