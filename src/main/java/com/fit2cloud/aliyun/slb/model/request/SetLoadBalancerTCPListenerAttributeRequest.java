package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class SetLoadBalancerTCPListenerAttributeRequest extends Request {
	private String LoadBalancerId; 
	private Integer ListenerPort;
	private Integer Bandwidth;
	private String Scheduler;
	private Integer PersistenceTimeout;
	private Integer HealthCheckConnectPort;
	private Integer HealthyThreshold;
	private Integer UnhealthyThreshold;
	private Integer HealthCheckConnectTimeout;
	private Integer HealthCheckInterval;
	public String getLoadBalancerId() {
		return LoadBalancerId;
	}
	public void setLoadBalancerId(String loadBalancerId) {
		LoadBalancerId = loadBalancerId;
	}
	public Integer getListenerPort() {
		return ListenerPort;
	}
	public void setListenerPort(Integer listenerPort) {
		ListenerPort = listenerPort;
	}
	public Integer getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		Bandwidth = bandwidth;
	}
	public String getScheduler() {
		return Scheduler;
	}
	public void setScheduler(String scheduler) {
		Scheduler = scheduler;
	}
	public Integer getPersistenceTimeout() {
		return PersistenceTimeout;
	}
	public void setPersistenceTimeout(Integer persistenceTimeout) {
		PersistenceTimeout = persistenceTimeout;
	}
	public Integer getHealthCheckConnectPort() {
		return HealthCheckConnectPort;
	}
	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		HealthCheckConnectPort = healthCheckConnectPort;
	}
	public Integer getHealthyThreshold() {
		return HealthyThreshold;
	}
	public void setHealthyThreshold(Integer healthyThreshold) {
		HealthyThreshold = healthyThreshold;
	}
	public Integer getUnhealthyThreshold() {
		return UnhealthyThreshold;
	}
	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		UnhealthyThreshold = unhealthyThreshold;
	}
	public Integer getHealthCheckConnectTimeout() {
		return HealthCheckConnectTimeout;
	}
	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		HealthCheckConnectTimeout = healthCheckConnectTimeout;
	}
	public Integer getHealthCheckInterval() {
		return HealthCheckInterval;
	}
	public void setHealthCheckInterval(Integer healthCheckInterval) {
		HealthCheckInterval = healthCheckInterval;
	}
}
