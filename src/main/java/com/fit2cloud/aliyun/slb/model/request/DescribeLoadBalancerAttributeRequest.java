package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class DescribeLoadBalancerAttributeRequest extends Request {
	private String LoadBalancerId;

	public String getLoadBalancerId() {
		return LoadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
}
