package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.slb.model.BackendServers;
import com.fit2cloud.aliyun.slb.model.ListenerPorts;

public class DescribeLoadBalancerAttributeResponse extends Response {
	private String LoadBalancerId; 
	private String RegionId;
	private String LoadBalancerName;
	private String LoadBalancerStatus;
	private String Address;
	private String AddressType;
	private String InternetChargeType;
	private Integer Bandwidth;
	private String CreateTime;
	private ListenerPorts ListenerPorts;
	private BackendServers BackendServers;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getLoadBalancerName() {
		return LoadBalancerName;
	}
	public void setLoadBalancerName(String loadBalancerName) {
		LoadBalancerName = loadBalancerName;
	}
	public String getLoadBalancerStatus() {
		return LoadBalancerStatus;
	}
	public void setLoadBalancerStatus(String loadBalancerStatus) {
		LoadBalancerStatus = loadBalancerStatus;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public Integer getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		Bandwidth = bandwidth;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public ListenerPorts getListenerPorts() {
		return ListenerPorts;
	}
	public void setListenerPorts(ListenerPorts listenerPorts) {
		ListenerPorts = listenerPorts;
	}
	public BackendServers getBackendServers() {
		return BackendServers;
	}
	public void setBackendServers(BackendServers backendServers) {
		BackendServers = backendServers;
	}
}
