package com.fit2cloud.aliyun;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.aliyun.ecs.ECSClient;
import com.fit2cloud.aliyun.ecs.model.DataDisk;
import com.fit2cloud.aliyun.ecs.model.Instance;
import com.fit2cloud.aliyun.ecs.model.SystemDisk;
import com.fit2cloud.aliyun.ecs.model.request.AllocatePublicIpAddressRequest;
import com.fit2cloud.aliyun.ecs.model.request.AttachDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.AuthorizeOrRevokeSecurityGroupRequest;
import com.fit2cloud.aliyun.ecs.model.request.CreateDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.CreateImageRequest;
import com.fit2cloud.aliyun.ecs.model.request.CreateInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.request.CreateSecurityGroupsRequest;
import com.fit2cloud.aliyun.ecs.model.request.CreateSnapshotRequest;
import com.fit2cloud.aliyun.ecs.model.request.DeleteImageRequest;
import com.fit2cloud.aliyun.ecs.model.request.DeleteInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.request.DeleteOrReInitDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.DeleteSecurityGroupRequest;
import com.fit2cloud.aliyun.ecs.model.request.DeleteSnapshotRequest;
import com.fit2cloud.aliyun.ecs.model.request.DetachDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.GetInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.request.JoinOrLeaveSecurityGroupRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListDisksRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListInstanceMonitorDataRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListInstancesRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSecurityGroupsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSecurityPermissionsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSnapshotsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListZonesRequest;
import com.fit2cloud.aliyun.ecs.model.request.ModifyAutoSnapshotPolicyRequest;
import com.fit2cloud.aliyun.ecs.model.request.ModifyDiskAttributeRequest;
import com.fit2cloud.aliyun.ecs.model.request.ModifyInstanceAttributeRequest;
import com.fit2cloud.aliyun.ecs.model.request.ReplaceSystemDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.ResetDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.StartInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.request.StopOrRebootInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.response.AllocatePublicIpAddressResponse;
import com.fit2cloud.aliyun.ecs.model.response.CreateDiskResponse;
import com.fit2cloud.aliyun.ecs.model.response.CreateImageResponse;
import com.fit2cloud.aliyun.ecs.model.response.CreateInstanceResponse;
import com.fit2cloud.aliyun.ecs.model.response.CreateSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.response.CreateSnapshotResponse;
import com.fit2cloud.aliyun.ecs.model.response.GetInstanceResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListAutoSnapshotPolicyResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListDisksResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListImagesResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListInstanceMonitorDataResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListInstanceTypeResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListInstancesResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListRegionsResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListSecurityPermissionsResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListSnapshotsResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListZonesResponse;
import com.fit2cloud.aliyun.ecs.model.response.ReplaceSystemDiskResponse;

public class AliyunECSClientTest {

	private ECSClient client;

	@Before
	public void setUp() throws Exception {
		String ACCESS_KEY_ID = "YOUR_ACCESS_KEY";
    	String ACCESS_KEY_SECRET = "YOUR_SECRET_KEY";
    	client = new ECSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	}

	@Test
	public void testListRegions() {
		try {
			ListRegionsResponse response = client.listRegions();
			System.out.println("testListRegions :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListZonesString() {
		try {
			ListZonesResponse response = client.listZones("cn-qingdao");
			System.out.println("testListZonesString :: "+response);
			Assert.assertTrue(response.getZones().getList().size() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListZonesRequest() {
		try {
			ListZonesRequest r = new ListZonesRequest("cn-qingdao");
			ListZonesResponse response = client.listZones(r);
			System.out.println("testListZonesRequest :: "+response);
			Assert.assertTrue(response.getZones().getList().size() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListImagesString() {
		try {
			ListImagesResponse response = client.listImages("cn-beijing");
			System.out.println("testListImagesString :: "+response);
			Assert.assertTrue(response.getTotalCount() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListImagesRequest() {
		try {
			ListSecurityGroupsRequest r = new ListSecurityGroupsRequest("cn-qingdao");
			r.setPageSize(2);
			ListSecurityGroupsResponse response = client.listSecurityGroups(r);
			System.out.println("testListImagesRequest :: "+response);
			Assert.assertTrue(response.getTotalCount() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSecurityGroupsString() {
		try {
			ListSecurityGroupsResponse response = client.listSecurityGroups("cn-beijing");
			System.out.println("testListSecurityGroupsString :: "+response);
			Assert.assertTrue(response.getTotalCount() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSecurityGroupsRequest() {
		try {
			ListSecurityGroupsRequest r = new ListSecurityGroupsRequest("cn-qingdao");
			r.setPageSize(2);
			r.setPageNumber(2);
			ListSecurityGroupsResponse response = client.listSecurityGroups(r);
			System.out.println("testListSecurityGroupsRequest :: "+response);
			Assert.assertTrue(response.getTotalCount() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testCreateSecurityGroupString() {
		try {
			CreateSecurityGroupsResponse response = client.createSecurityGroup("cn-qingdao", "fit2cloud-junittest1");
			System.out.println("testCreateSecurityGroupString :: "+response);
			Assert.assertTrue(response.getSecurityGroupId() != null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testCreateSecurityGroupRequest() {
		try {
			CreateSecurityGroupsRequest r = new CreateSecurityGroupsRequest("cn-qingdao", "fit2cloud-junittest2");
			CreateSecurityGroupsResponse response = client.createSecurityGroup(r);
			System.out.println("testCreateSecurityGroupRequest :: "+response);
			Assert.assertTrue(response.getSecurityGroupId() != null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testAuthorizeSecurityGroup() {
		try {
			AuthorizeOrRevokeSecurityGroupRequest r = new AuthorizeOrRevokeSecurityGroupRequest();
			r.buildCIDRAndAllProtocolRequest("cn-qingdao", "sg-2820mbwt6", "0.0.0.0/0");
			Response response = client.authorizeSecurityGroup(r);
			System.out.println("testAuthorizeSecurityGroup :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testRevokeSecurityGroup() {
		try {
			AuthorizeOrRevokeSecurityGroupRequest revokeSecurityGroupRequest = new AuthorizeOrRevokeSecurityGroupRequest();
			revokeSecurityGroupRequest.buildCIDRAndAllProtocolRequest("cn-qingdao", "sg-2820mbwt6", "0.0.0.0/0");
			Response response = client.revokeSecurityGroup(revokeSecurityGroupRequest);
			System.out.println("testRevokeSecurityGroup :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSecurityPermissionsString() {
		try {
			ListSecurityPermissionsResponse response = client.listSecurityPermissions("cn-beijing", "Gac00d621-5928-449a-80a8-9e8d34cf691b");
			System.out.println("testListSecurityPermissionsString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSecurityPermissionsRequest() {
		try {
			ListSecurityPermissionsRequest r = new ListSecurityPermissionsRequest("cn-qingdao", "sg-2820mbwt6");
			ListSecurityPermissionsResponse response = client.listSecurityPermissions(r);
			System.out.println("testListSecurityPermissionsRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteSecurityGroupString() {
		try {
			Response response = client.deleteSecurityGroup("cn-qingdao", "sg-28kr1ezwy");
			System.out.println("testDeleteSecurityGroupString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteSecurityGroupRequest() {
		try {
			DeleteSecurityGroupRequest r = new DeleteSecurityGroupRequest("cn-qingdao", "sg-28eoy4mj1");
			Response response = client.deleteSecurityGroup(r);
			System.out.println("testDeleteSecurityGroupRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testJoinSecurityGroupString() {
		try {
			Response response = client.joinSecurityGroup("i-25thdni7b", "Gac00d621-5928-449a-80a8-9e8d34cf691b");
			System.out.println("testJoinSecurityGroupString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testJoinSecurityGroupRequest() {
		try {
			JoinOrLeaveSecurityGroupRequest r = new JoinOrLeaveSecurityGroupRequest("i-25thdni7b", "Gac00d621-5928-449a-80a8-9e8d34cf691b");
			Response response = client.joinSecurityGroup(r);
			System.out.println("testJoinSecurityGroupRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testLeaveSecurityGroupString() {
		try {
			Response response = client.leaveSecurityGroup("i-25thdni7b", "Gac00d621-5928-449a-80a8-9e8d34cf691b");
			System.out.println("testLeaveSecurityGroupString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testLeaveSecurityGroupRequest() {
		try {
			JoinOrLeaveSecurityGroupRequest r = new JoinOrLeaveSecurityGroupRequest("i-25thdni7b", "Gac00d621-5928-449a-80a8-9e8d34cf691b");
			Response response = client.leaveSecurityGroup(r);
			System.out.println("testLeaveSecurityGroupRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListInstanceType() {
		try {
			ListInstanceTypeResponse response = client.listInstanceType();
			System.out.println("testListInstanceType :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testCreateInstance() {
		try {
			Instance instance = new Instance("cn-beijing", "ubuntu1204_64_20G_aliaegis_20140703.vhd", "ecs.t1.xsmall", "G0f9c9862-efdf-4cb7-8fbe-9601f3392fdf");
			instance.setHostName("VM4test");
			CreateInstanceRequest r = new CreateInstanceRequest(instance);
			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setCategory("cloud");
			systemDisk.setDescription("my test system disk");
			systemDisk.setDiskName("TestSystemDisk");
			r.setSystemDisk(systemDisk);
			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			DataDisk d = new DataDisk(5);
			d.setCategory("cloud");
			d.setDiskName("mydisk1");
			d.setDevice("/dev/xvdg");
			dataDisks.add(d);
			// 临时云磁盘需要申请
//			DataDisk d2 = new DataDisk(5);
//			d2.setCategory("ephemeral");
//			d2.setDiskName("myephemeralDisk2");
//			d2.setDevice("/dev/xvdf");
//			dataDisks.add(d2);
			r.setDataDisks(dataDisks);
			CreateInstanceResponse response = client.createInstance(r);
			System.out.println("testCreateInstance :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetInstanceString() {
		try {
			GetInstanceResponse response = client.getInstance("i-25uh6z38k");
			System.out.println("testGetInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetInstanceRequest() {
		try {
			GetInstanceRequest r = new GetInstanceRequest("i-25uh6z38k");
			GetInstanceResponse response = client.getInstance(r);
			System.out.println("testGetInstanceRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListInstancesString() {
		try {
			ListInstancesResponse response = client.listInstances("cn-beijing");
			System.out.println("testListInstancesString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListInstancesRequest() {
		try {
			ListInstancesRequest r = new ListInstancesRequest("cn-beijing");
			ListInstancesResponse response = client.listInstances(r);
			System.out.println("testListInstancesRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testStartInstanceString() {
		try {
			Response response = client.startInstance("i-25uh6z38k");
			System.out.println("testStartInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testStartInstanceRequest() {
		try {
			StartInstanceRequest r = new StartInstanceRequest("i-25uh6z38k");
			Response response = client.startInstance(r);
			System.out.println("testStartInstanceRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testAllocatePublicIpString() {
		try {
			AllocatePublicIpAddressResponse response = client.allocatePublicIp("i-25zh2k2lv");
			System.out.println("testAllocatePublicIpString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testAllocatePublicIpRequest() {
		try {
			AllocatePublicIpAddressRequest r = new AllocatePublicIpAddressRequest("i-25zh2k2lv");
			AllocatePublicIpAddressResponse response = client.allocatePublicIp(r);
			System.out.println("testAllocatePublicIpRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testRebootInstanceString() {
		try {
			Response response = client.rebootInstance("i-25uh6z38k");
			System.out.println("testRebootInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testRebootInstanceRequest() {
		try {
			StopOrRebootInstanceRequest r = new StopOrRebootInstanceRequest("i-25zh2k2lv");
			Response response = client.rebootInstance(r);
			System.out.println("testRebootInstanceRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testStopInstanceString() {
		try {
			Response response = client.stopInstance("i-25zh2k2lv");
			System.out.println("testStopInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testStopInstanceRequest() {
		try {
			StopOrRebootInstanceRequest r = new StopOrRebootInstanceRequest("i-25uh6z38k");
			Response response = client.stopInstance(r);
			System.out.println("testStopInstanceRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteInstanceString() {
		try {
			Response response = client.deleteInstance("i-25uh6z38k");
			System.out.println("testDeleteInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteInstanceRequest() {
		try {
			DeleteInstanceRequest r = new DeleteInstanceRequest("i-25zh2k2lv");
			Response response = client.deleteInstance(r);
			System.out.println("testDeleteInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModifyInstanceAttribute() {
		try {
			ModifyInstanceAttributeRequest modifyInstanceAttributeRequest = new ModifyInstanceAttributeRequest("i-25zh2k2lv");
			modifyInstanceAttributeRequest.setHostName("MyNewHostName");
			modifyInstanceAttributeRequest.setDescription("new desc");
			modifyInstanceAttributeRequest.setInstanceName("NewInstanceName");
			Response response = client.modifyInstanceAttribute(modifyInstanceAttributeRequest);
			System.out.println("testStopInstanceString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testCreateDisk() {
		try {
			CreateDiskRequest createDiskRequest = new CreateDiskRequest("cn-beijing", "cn-beijing-a", 5);
			CreateDiskResponse response = client.createDisk(createDiskRequest);
			System.out.println("testCreateDisk :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListDisksString() {
		try {
			ListDisksResponse response = client.listDisks("cn-beijing");
			System.out.println("testListDisksString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListDisksRequest() {
		try {
			ListDisksRequest r = new ListDisksRequest("cn-beijing");
			ListDisksResponse response = client.listDisks(r);
			System.out.println("testListDisksRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testAttachDiskString() {
		try {
			Response response = client.attachDisk("i-25uh6z38k", "d-2583k8j4o");
			System.out.println("testAttachDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testAttachDiskRequest() {
		try {
			AttachDiskRequest r = new AttachDiskRequest("i-25uh6z38k", "d-2583k8j4o");
			Response response = client.attachDisk(r);
			System.out.println("testAttachDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDetachDiskString() {
		try {
			Response response = client.detachDisk("i-25uh6z38k", "d-2583k8j4o");
			System.out.println("testDetachDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDetachDiskRequest() {
		try {
			DetachDiskRequest r = new DetachDiskRequest("i-25uh6z38k", "d-2583k8j4o");
			Response response = client.detachDisk(r);
			System.out.println("testDetachDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModifyDiskAttribute() {
		try {
			ModifyDiskAttributeRequest r = new ModifyDiskAttributeRequest("d-2583k8j4o");
			r.setDescription("new description");
			r.setDiskName("newDiskName");
			Response response = client.modifyDiskAttribute(r);
			System.out.println("testModifyDiskAttribute :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteDiskString() {
		try {
			Response response = client.deleteDisk("d-2583k8j4o");
			System.out.println("testDeleteDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteDiskRequest() {
		try {
			DeleteOrReInitDiskRequest r = new DeleteOrReInitDiskRequest("d-2583k8j4o");
			Response response = client.deleteDisk(r);
			System.out.println("testDeleteDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testReInitDiskString() {
		try {
			Response response = client.reInitDisk("d-2583k8j4o");
			System.out.println("testReInitDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testReInitDiskRequest() {
		try {
			DeleteOrReInitDiskRequest r = new DeleteOrReInitDiskRequest("d-2583k8j4o");
			Response response = client.reInitDisk(r);
			System.out.println("testReInitDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testResetDiskString() {
		try {
			Response response = client.resetDisk("d-25p39du6w", "s-25mikyl6y");
			System.out.println("testResetDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testResetDiskRequest() {
		try {
			ResetDiskRequest r = new ResetDiskRequest("d-25p39du6w", "s-25mikyl6y");
			Response response = client.resetDisk(r );
			System.out.println("testResetDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testReplaceSystemDiskString() {
		// TODO 需添加白名单
		try {
			ReplaceSystemDiskResponse response = client.replaceSystemDisk("i-25uh6z38k", "centos6u5_64_20G_aliaegis_20140703.vhd");
			System.out.println("testReplaceSystemDiskString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testReplaceSystemDiskRequest() {
		// TODO 需添加白名单
		try {
			ReplaceSystemDiskRequest r = new ReplaceSystemDiskRequest("InstanceId", "ImageId");
			ReplaceSystemDiskResponse response = client.replaceSystemDisk(r);
			System.out.println("testReplaceSystemDiskRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testCreateSnapshot() {
		try {
			CreateSnapshotRequest r = new CreateSnapshotRequest("d-25p39du6w");
			r.setDescription("test snapshots");
			r.setSnapshotName("TestSnapshot");
			CreateSnapshotResponse response = client.createSnapshot(r);
			System.out.println("testCreateSnapshot :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteSnapshotString() {
		try {
			Response response = client.deleteSnapshot("s-25l1i1we3");
			System.out.println("testDeleteSnapshotString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteSnapshotRequest() {
		try {
			DeleteSnapshotRequest r = new DeleteSnapshotRequest("s-25l1i1we3");
			Response response = client.deleteSnapshot(r);
			System.out.println("testDeleteSnapshotRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSnapshotsString() {
		try {
			ListSnapshotsResponse response = client.listSnapshots("cn-beijing");
			System.out.println("testListSnapshotsString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListSnapshotsRequest() {
		try {
			ListSnapshotsRequest r = new ListSnapshotsRequest("cn-beijing");
			r.setSnapshotIds("['s-25mikyl6y']");
			ListSnapshotsResponse response = client.listSnapshots(r);
			System.out.println("testListSnapshotsRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModifyAutoSnapshotPolicy() {
		try {
			ModifyAutoSnapshotPolicyRequest r = new ModifyAutoSnapshotPolicyRequest();
			r.setDataDiskPolicyEnabled("true");
			Response response = client.modifyAutoSnapshotPolicy(r);
			System.out.println("testModifyAutoSnapshotPolicy :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListAutoSnapshotPolicy() {
		try {
			ListAutoSnapshotPolicyResponse response = client.listAutoSnapshotPolicy();
			System.out.println("testListAutoSnapshotPolicy :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testCreateImage() {
		try {
			CreateImageRequest r = new CreateImageRequest("cn-beijing", "s-25mikyl6y");
			CreateImageResponse response = client.createImage(r);
			System.out.println("testCreateImage :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteImageString() {
		try {
			Response response = client.deleteImage("cn-beijing", "m-25hgaq94m");
			System.out.println("testDeleteImageString :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteImageRequest() {
		try {
			DeleteImageRequest r = new DeleteImageRequest("cn-beijing", "imageId");
			Response response = client.deleteImage(r);
			System.out.println("testDeleteImageRequest :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testListInstanceMonitorData() {
		// TODO ecs-api返回结果有误,等待ecs更新
		try {
			ListInstanceMonitorDataRequest r = new ListInstanceMonitorDataRequest("i-25thdni7b", "2014-08-14T11:00:00Z", "2014-08-14T11:20:00Z");
			ListInstanceMonitorDataResponse response = client.listInstanceMonitorData(r);
			System.out.println("testListInstanceMonitorData :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
