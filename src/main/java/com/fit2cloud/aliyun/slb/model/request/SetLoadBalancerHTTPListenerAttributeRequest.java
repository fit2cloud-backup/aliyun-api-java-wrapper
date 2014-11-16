package com.fit2cloud.aliyun.slb.model.request;

import com.fit2cloud.aliyun.Request;

public class SetLoadBalancerHTTPListenerAttributeRequest extends Request {
	private String LoadBalancerId; 
	private Integer ListenerPort; 
	private Integer Bandwidth;
	private String XForwardedFor;
	private String Scheduler;
	private String StickySession;
	private String StickySessionType;
	private Integer CookieTimeout;
	private String Cookie;
	private String HealthCheck;
	private String HealthCheckDomain;
	private String HealthCheckURI;
	private Integer HealthCheckConnectPort;
	private Integer HealthyThreshold;
	private Integer UnhealthyThreshold;
	private Integer HealthCheckTimeout;
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
	public String getXForwardedFor() {
		return XForwardedFor;
	}
	public void setXForwardedFor(String xForwardedFor) {
		XForwardedFor = xForwardedFor;
	}
	public String getScheduler() {
		return Scheduler;
	}
	public void setScheduler(String scheduler) {
		Scheduler = scheduler;
	}
	public String getStickySession() {
		return StickySession;
	}
	public void setStickySession(String stickySession) {
		StickySession = stickySession;
	}
	public String getStickySessionType() {
		return StickySessionType;
	}
	public void setStickySessionType(String stickySessionType) {
		StickySessionType = stickySessionType;
	}
	public Integer getCookieTimeout() {
		return CookieTimeout;
	}
	public void setCookieTimeout(Integer cookieTimeout) {
		CookieTimeout = cookieTimeout;
	}
	public String getCookie() {
		return Cookie;
	}
	public void setCookie(String cookie) {
		Cookie = cookie;
	}
	public String getHealthCheck() {
		return HealthCheck;
	}
	public void setHealthCheck(String healthCheck) {
		HealthCheck = healthCheck;
	}
	public String getHealthCheckDomain() {
		return HealthCheckDomain;
	}
	public void setHealthCheckDomain(String healthCheckDomain) {
		HealthCheckDomain = healthCheckDomain;
	}
	public String getHealthCheckURI() {
		return HealthCheckURI;
	}
	public void setHealthCheckURI(String healthCheckURI) {
		HealthCheckURI = healthCheckURI;
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
	public Integer getHealthCheckTimeout() {
		return HealthCheckTimeout;
	}
	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		HealthCheckTimeout = healthCheckTimeout;
	}
	public Integer getHealthCheckInterval() {
		return HealthCheckInterval;
	}
	public void setHealthCheckInterval(Integer healthCheckInterval) {
		HealthCheckInterval = healthCheckInterval;
	}
}
