package com.fit2cloud.aliyun;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.aliyun.slb.SLBClient;
import com.fit2cloud.aliyun.slb.model.AddressType;
import com.fit2cloud.aliyun.slb.model.BackendServer;
import com.fit2cloud.aliyun.slb.model.InternetChargeType;
import com.fit2cloud.aliyun.slb.model.LoadBalancerStatus;
import com.fit2cloud.aliyun.slb.model.request.AddBackendServersRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerHTTPListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerRequest;
import com.fit2cloud.aliyun.slb.model.request.CreateLoadBalancerTCPListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.DeleteLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.DeleteLoadBalancerRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeHealthStatusRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerHTTPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancerTCPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.DescribeLoadBalancersRequest;
import com.fit2cloud.aliyun.slb.model.request.ModifyLoadBalancerInternetSpecRequest;
import com.fit2cloud.aliyun.slb.model.request.RemoveBackendServersRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerHTTPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerStatusRequest;
import com.fit2cloud.aliyun.slb.model.request.SetLoadBalancerTCPListenerAttributeRequest;
import com.fit2cloud.aliyun.slb.model.request.StartLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.request.StopLoadBalancerListenerRequest;
import com.fit2cloud.aliyun.slb.model.response.CreateLoadBalancerResponse;
import com.google.gson.Gson;

public class AliyunSLBClientTest {

	private SLBClient client;
	private String loadBalancerName = "test-lb";
	private String regionId = "cn-qingdao";
	private String loadBalancerId = "149a965a0ee-cn-qingdao-cm5-a01";
	private String serverId = "i-282m46ars";

	@Before
	public void setUp() throws Exception {
		String ACCESS_KEY_ID = "YOUR_ACCESS_KEY";
    	String ACCESS_KEY_SECRET = "YOUR_SECRET_KEY";
    	client = new SLBClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	}

	@Test
	public void testCreateLoadBalancer() {
		try {
			CreateLoadBalancerRequest request = new CreateLoadBalancerRequest();
			request.setAddressType(AddressType.INTERNET);
			request.setBandwidth(1);
			request.setInternetChargeType(InternetChargeType.PAYBYTRAFFIC);
			request.setRegionId(regionId);
			request.setLoadBalancerName(loadBalancerName);
			CreateLoadBalancerResponse response = client.createLoadBalancer(request);
			System.out.println("testCreateLoadBalancer :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyLoadBalancerInternetSpec() {
		try {
			ModifyLoadBalancerInternetSpecRequest request = new ModifyLoadBalancerInternetSpecRequest();
			request.setBandwidth(2);
			request.setInternetChargeType(InternetChargeType.PAYBYBANDWIDTH);
			request.setLoadBalancerId(loadBalancerId);
			Response response = client.modifyLoadBalancerInternetSpec(request);
			System.out.println("testModifyLoadBalancerInternetSpec :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteLoadBalancer() {
		try {
			DeleteLoadBalancerRequest request = new DeleteLoadBalancerRequest();
			request.setLoadBalancerId(loadBalancerId);
			Response response = client.deleteLoadBalancer(request);
			System.out.println("testDeleteLoadBalancer :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testSetLoadBalancerStatus() {
		try {
			SetLoadBalancerStatusRequest request = new SetLoadBalancerStatusRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setLoadBalancerStatus(LoadBalancerStatus.ACTIVE);
			Response response = client.setLoadBalancerStatus(request);
			System.out.println("testSetLoadBalancerStatus :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeLoadBalancers() {
		try {
			DescribeLoadBalancersRequest request = new DescribeLoadBalancersRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setAddressType(AddressType.INTERNET);
			request.setRegionId(regionId);
			Response response = client.describeLoadBalancers(request);
			System.out.println("testDescribeLoadBalancers :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeLoadBalancerAttribute() {
		try {
			DescribeLoadBalancerAttributeRequest request = new DescribeLoadBalancerAttributeRequest();
			request.setLoadBalancerId(loadBalancerId);
			Response response = client.describeLoadBalancerAttribute(request);
			System.out.println("testDescribeLoadBalancerAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeRegions() {
		try {
			Response response = client.describeRegions();
			System.out.println("testDescribeRegions :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateLoadBalancerHTTPListener() {
		try {
			CreateLoadBalancerHTTPListenerRequest request = new CreateLoadBalancerHTTPListenerRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(80);
			request.setBackendServerPort(80);
			request.setBandwidth(1);
			request.setStickySession("off");
			request.setHealthCheck("on");
			request.setHealthCheckDomain("$_ip");
			request.setHealthCheckURI("/test/index.html");
			request.setHealthCheckConnectPort(8080);
			request.setHealthyThreshold(4);
			request.setUnhealthyThreshold(4);
			request.setHealthCheckTimeout(3);
			request.setHealthCheckInterval(5);
			Response response = client.createLoadBalancerHTTPListener(request);
			System.out.println("testCreateLoadBalancerHTTPListener :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateLoadBalancerTCPListener() {
		try {
			CreateLoadBalancerTCPListenerRequest request = new CreateLoadBalancerTCPListenerRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(553);
			request.setBackendServerPort(553);
			request.setBandwidth(1);
			Response response = client.createLoadBalancerTCPListener(request);
			System.out.println("testCreateLoadBalancerTCPListener :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteLoadBalancerListener() {
		try {
			DeleteLoadBalancerListenerRequest request = new DeleteLoadBalancerListenerRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(80);
			Response response = client.deleteLoadBalancerListener(request);
			System.out.println("testDeleteLoadBalancerListener :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testStartLoadBalancerListener() {
		try {
			StartLoadBalancerListenerRequest request = new StartLoadBalancerListenerRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(443);
			Response response = client.startLoadBalancerListener(request);
			System.out.println("testStartLoadBalancerListener :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testStopLoadBalancerListener() {
		try {
			StopLoadBalancerListenerRequest request = new StopLoadBalancerListenerRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(443);
			Response response = client.stopLoadBalancerListener(request);
			System.out.println("testStopLoadBalancerListener :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testSetLoadBalancerHTTPListenerAttribute() {
		try {
			SetLoadBalancerHTTPListenerAttributeRequest request = new SetLoadBalancerHTTPListenerAttributeRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(80);
			request.setBandwidth(2);
			request.setStickySession("off");
			request.setHealthCheck("off");
			Response response = client.setLoadBalancerHTTPListenerAttribute(request);
			System.out.println("testSetLoadBalancerHTTPListenerAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testSetLoadBalancerTCPListenerAttribute() {
		try {
			SetLoadBalancerTCPListenerAttributeRequest request = new SetLoadBalancerTCPListenerAttributeRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(443);
			request.setBandwidth(1);
			Response response = client.setLoadBalancerTCPListenerAttribute(request);
			System.out.println("testSetLoadBalancerTCPListenerAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeLoadBalancerHTTPListenerAttribute() {
		try {
			DescribeLoadBalancerHTTPListenerAttributeRequest request = new DescribeLoadBalancerHTTPListenerAttributeRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(80);
			Response response = client.describeLoadBalancerHTTPListenerAttribute(request);
			System.out.println("testDescribeLoadBalancerHTTPListenerAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeLoadBalancerTCPListenerAttribute() {
		try {
			DescribeLoadBalancerTCPListenerAttributeRequest request = new DescribeLoadBalancerTCPListenerAttributeRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(553);
			Response response = client.describeLoadBalancerTCPListenerAttribute(request);
			System.out.println("testDescribeLoadBalancerTCPListenerAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testAddBackendServers() {
		try {
			AddBackendServersRequest request = new AddBackendServersRequest();
			request.setLoadBalancerId(loadBalancerId);
			List<BackendServer> backendServer = new ArrayList<BackendServer>();
			BackendServer s1 = new BackendServer();
			s1.setServerId(serverId);
			s1.setWeight(100);
			backendServer.add(s1);
			String backendServers = new Gson().toJson(backendServer);
			request.setBackendServers(backendServers);
			Response response = client.addBackendServers(request);
			System.out.println("testAddBackendServers :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testRemoveBackendServers() {
		try {
			RemoveBackendServersRequest request = new RemoveBackendServersRequest();
			request.setLoadBalancerId(loadBalancerId);
			
			List<String> backendServer = new ArrayList<String>();
			backendServer.add(serverId);
			String backendServers = new Gson().toJson(backendServer);
			request.setBackendServers(backendServers);
			Response response = client.removeBackendServers(request);
			System.out.println("testRemoveBackendServers :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDescribeHealthStatus() {
		try {
			DescribeHealthStatusRequest request = new DescribeHealthStatusRequest();
			request.setLoadBalancerId(loadBalancerId);
			request.setListenerPort(80);
			Response response = client.describeHealthStatus(request);
			System.out.println("testDescribeHealthStatus :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
