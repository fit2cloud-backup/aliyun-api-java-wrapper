package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.LoadBalancers;

public class DescribeLoadBalancersResponse extends Response {
	private LoadBalancers LoadBalancers;

	public LoadBalancers getLoadBalancers() {
		return LoadBalancers;
	}

	public void setLoadBalancers(LoadBalancers loadBalancers) {
		LoadBalancers = loadBalancers;
	}
}
