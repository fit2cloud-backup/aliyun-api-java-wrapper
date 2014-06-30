package com.fit2cloud.aliyun;

import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.aliyun.ecs.ECSClient;
import com.fit2cloud.aliyun.ecs.model.CreateInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.CreateInstanceResponse;
import com.fit2cloud.aliyun.ecs.model.CreateSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.ListImagesResponse;
import com.fit2cloud.aliyun.ecs.model.ListInstanceTypeResponse;
import com.fit2cloud.aliyun.ecs.model.ListInstancesResponse;
import com.fit2cloud.aliyun.ecs.model.ListRegionsResponse;
import com.fit2cloud.aliyun.ecs.model.ListSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.ListZonesResponse;

public class AliyunECSClientTest {
	
	private ECSClient client;
	
	@Before
	public void setup(){
    	String ACCESS_KEY_ID = "Your Access Key";
    	String ACCESS_KEY_SECRET = "Your Secret Key";
        client = new ECSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	}
	
	@Test
	public void listRegions() throws AliyunClientException, AliyunServiceException{
		ListRegionsResponse response = client.listRegions();
		System.out.println(response.getRegions().getList());
	}
	
	@Test
	public void listZones() throws AliyunClientException, AliyunServiceException{
		ListZonesResponse response = client.listZones("cn-qingdao");
		System.out.println(response.getZones().getList());
	}
	
	@Test
	public void listImages() throws AliyunClientException, AliyunServiceException{
		ListImagesResponse response = client.listImages("cn-qingdao");
		System.out.println(response.getImages().getList());
	}
	
	@Test
	public void listSecurityGroups() throws AliyunClientException, AliyunServiceException{
		ListSecurityGroupsResponse response = client.listSecurityGroups("cn-qingdao");
		System.out.println(response.getSecurityGroups().getList());
	}
	
	@Test
	public void createSecurityGroup() throws AliyunClientException, AliyunServiceException{
		CreateSecurityGroupsResponse response = client.createSecurityGroup("cn-qingdao", "fit2cloud-default");
		System.out.println(response.getSecurityGroupId());
	}
	
	@Test
	public void listInstanceType() throws AliyunClientException, AliyunServiceException{
		ListInstanceTypeResponse response = client.listInstanceType();
		System.out.println(response.getInstanceTypes().getList());
	}
	
	@Test
	public void createInstance() throws AliyunClientException, AliyunServiceException{
		CreateInstanceRequest request = new CreateInstanceRequest();
		request.setImageId("ubuntu1204_64_20G_aliaegis_20131121.vhd");
		request.setInstanceName("api-test-instance");
		request.setInstanceType("ecs.t1.xsmall");
		request.setInternetChargeType("PayByTraffic");
		request.setInternetMaxBandwidthOut("1");
		request.setPassword("F2c2014test");
		request.setRegionId("cn-qingdao");
		request.setSecurityGroupId("Please input security group id here");
		CreateInstanceResponse response = client.createInstance(request);
		System.out.println("InstanceId:" + response.getInstanceId());
	}
	
	@Test
	public void listInstances() throws AliyunClientException, AliyunServiceException{
		ListInstancesResponse response = client.listInstances("cn-qingdao");
		System.out.println(response.getInstanceStatuses().getList());
	}
	
}
