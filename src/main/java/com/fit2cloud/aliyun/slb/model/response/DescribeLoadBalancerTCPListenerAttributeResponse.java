package com.fit2cloud.aliyun.slb.model.response;

import com.fit2cloud.aliyun.Response;

public class DescribeLoadBalancerTCPListenerAttributeResponse extends Response {
	private Integer ListenerPort;
	private Integer BackendServerPort;
	private Integer Bandwidth;
	private String Status; 
	private String Scheduler;
	private Integer PersistenceTimeout;
	private String HealthCheck;
	private Integer HealthyThreshold;
	private Integer UnhealthyThreshold;
	private Integer HealthCheckConnectTimeout; 
	private Integer HealthCheckConnectPort; 
	private Integer HealthCheckInterval;
	public Integer getListenerPort() {
		return ListenerPort;
	}
	public void setListenerPort(Integer listenerPort) {
		ListenerPort = listenerPort;
	}
	public Integer getBackendServerPort() {
		return BackendServerPort;
	}
	public void setBackendServerPort(Integer backendServerPort) {
		BackendServerPort = backendServerPort;
	}
	public Integer getBandwidth() {
		return Bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		Bandwidth = bandwidth;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
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
	public String getHealthCheck() {
		return HealthCheck;
	}
	public void setHealthCheck(String healthCheck) {
		HealthCheck = healthCheck;
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
	public Integer getHealthCheckConnectPort() {
		return HealthCheckConnectPort;
	}
	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		HealthCheckConnectPort = healthCheckConnectPort;
	}
	public Integer getHealthCheckInterval() {
		return HealthCheckInterval;
	}
	public void setHealthCheckInterval(Integer healthCheckInterval) {
		HealthCheckInterval = healthCheckInterval;
	}
}
