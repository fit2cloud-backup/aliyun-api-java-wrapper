package com.fit2cloud.aliyun.ecs;

import java.util.HashMap;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.ecs.model.AddDiskRequest;
import com.fit2cloud.aliyun.ecs.model.AddDiskResponse;
import com.fit2cloud.aliyun.ecs.model.AllolcatePublicIpResponse;
import com.fit2cloud.aliyun.ecs.model.AuthorizeOrRevokeSecurityGroupRequest;
import com.fit2cloud.aliyun.ecs.model.CreateInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.CreateInstanceResponse;
import com.fit2cloud.aliyun.ecs.model.CreateSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.GetInstanceResponse;
import com.fit2cloud.aliyun.ecs.model.ListDisksResponse;
import com.fit2cloud.aliyun.ecs.model.ListImagesResponse;
import com.fit2cloud.aliyun.ecs.model.ListInstanceTypeResponse;
import com.fit2cloud.aliyun.ecs.model.ListInstancesResponse;
import com.fit2cloud.aliyun.ecs.model.ListRegionsResponse;
import com.fit2cloud.aliyun.ecs.model.ListSecurityGroupsResponse;
import com.fit2cloud.aliyun.ecs.model.ListSecurityPermissionsResponse;
import com.fit2cloud.aliyun.ecs.model.ListZonesResponse;
import com.fit2cloud.aliyun.ecs.model.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class ECSClient 
{
    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    private ECSRequest request;

    public ECSClient(AliyunCredentials credentials){
    	request = new ECSRequest(credentials);
    }
    public ListRegionsResponse listRegions() throws AliyunClientException, AliyunServiceException  {
        return gson.fromJson(request.execute("DescribeRegions", null), ListRegionsResponse.class);
    }

    @SuppressWarnings("serial")
    public ListZonesResponse listZones(final String RegionId) throws AliyunClientException, AliyunServiceException  {
		return gson.fromJson(request.execute("DescribeZones",
                new HashMap<String, String>() {
                    { put("RegionId", RegionId); }
                }), ListZonesResponse.class);
    }

    public ListImagesResponse listImages(final String RegionId) throws AliyunClientException, AliyunServiceException {
    	int pageNumber = 1;
    	int pageSize = 50;
    	int count = 0;
    	ListImagesResponse result = new ListImagesResponse();
    	while (true){
    		HashMap<String, String> params = new HashMap<String, String>();
    		params.put("RegionId", RegionId);
    		params.put("PageNumber", String.valueOf(pageNumber));
    		params.put("PageSize", String.valueOf(pageSize));
    		ListImagesResponse response = gson.fromJson( request.execute("DescribeImages",params), ListImagesResponse.class);
    		result.add(response);
    		count = count + pageSize;
    		pageNumber = pageNumber + 1;
    		if (count>=response.getTotalCount()){
    			break;
    		}
    	}
    	return result;
    }
    
    public ListSecurityGroupsResponse listSecurityGroups(final String RegionId) throws AliyunClientException, AliyunServiceException {
    	int pageNumber = 1;
    	int pageSize = 50;
    	int count = 0;
    	ListSecurityGroupsResponse result = new ListSecurityGroupsResponse();
    	while (true){
    		HashMap<String, String> params = new HashMap<String, String>();
    		params.put("RegionId", RegionId);
    		params.put("PageNumber", String.valueOf(pageNumber));
    		params.put("PageSize", String.valueOf(pageSize));
    		ListSecurityGroupsResponse response =  gson.fromJson( request.execute("DescribeSecurityGroups",params), ListSecurityGroupsResponse.class);
    		result.add(response);
    		count = count + pageSize;
    		pageNumber = pageNumber + 1;
    		if (count>=response.getTotalCount()){
    			break;
    		}
    	}
    	return result;
    }
    
    @SuppressWarnings("serial")
    public CreateSecurityGroupsResponse createSecurityGroup(final String RegionId, final String Description) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("CreateSecurityGroup",
                new HashMap<String, String>() {
                    { put("RegionId", RegionId); }
                    { put("Description", Description); }
                }), CreateSecurityGroupsResponse.class);
    }
    
    public Response authorizeSecurityGroup(final AuthorizeOrRevokeSecurityGroupRequest authorizeSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("AuthorizeSecurityGroup",	authorizeSecurityGroupRequest.toMap()), Response.class);
    } 
    
    public Response revokeSecurityGroup(final AuthorizeOrRevokeSecurityGroupRequest revokeSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("RevokeSecurityGroup",	revokeSecurityGroupRequest.toMap()), Response.class);
    } 
    
    @SuppressWarnings("serial")
    public ListSecurityPermissionsResponse listSecurityPermissions(final String RegionId, final String SecurityGroupId) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DescribeSecurityGroupAttribute",
                new HashMap<String, String>() {
		            { put("RegionId", RegionId); }
		            { put("SecurityGroupId", SecurityGroupId); }
        }), ListSecurityPermissionsResponse.class);
    }  
    
    @SuppressWarnings("serial")
    public Response deleteSecurityGroup(final String RegionId, final String SecurityGroupId) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DeleteSecurityGroup",
                new HashMap<String, String>() {
                    { put("RegionId", RegionId); }
                    { put("SecurityGroupId", SecurityGroupId); }
                }), Response.class);
    }
    
    @SuppressWarnings("serial")
    public Response joinSecurityGroup(final String InstanceId, final String SecurityGroupId) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("JoinSecurityGroup",
                new HashMap<String, String>() {
                    { put("InstanceId", InstanceId); }
                    { put("SecurityGroupId", SecurityGroupId); }
                }), Response.class);
    }
    
    public ListInstanceTypeResponse listInstanceType() throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DescribeInstanceTypes",null), ListInstanceTypeResponse.class);
    } 
    
    public CreateInstanceResponse createInstance(final CreateInstanceRequest createInstanceRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException{
    	return gson.fromJson( request.execute("CreateInstance",	createInstanceRequest.toMap()), CreateInstanceResponse.class);
    }
    
    @SuppressWarnings("serial")
    public GetInstanceResponse getInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DescribeInstanceAttribute",
                new HashMap<String, String>() {
                    { put("InstanceId", InstanceId); }
                }), GetInstanceResponse.class);
    }
    
    public ListInstancesResponse listInstances(final String RegionId)
            throws AliyunClientException, AliyunServiceException {
    	int pageNumber = 1;
    	int pageSize = 50;
    	int count = 0;
    	ListInstancesResponse result = new ListInstancesResponse();
    	while (true){
    		HashMap<String, String> params = new HashMap<String, String>();
    		params.put("RegionId", RegionId);
    		params.put("PageNumber", String.valueOf(pageNumber));
    		params.put("PageSize", String.valueOf(pageSize));
    		ListInstancesResponse response =  gson.fromJson( request.execute("DescribeInstanceStatus",params), ListInstancesResponse.class);
    		result.add(response);
    		count = count + pageSize;
    		pageNumber = pageNumber + 1;
    		if (count>=response.getTotalCount()){
    			break;
    		}
    	}
    	return result;
    }

    @SuppressWarnings("serial")
    public Response startInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("StartInstance",
                new HashMap<String, String>() {
            { put("InstanceId", InstanceId); }
        }), Response.class);
    }
    
    @SuppressWarnings("serial")
    public AllolcatePublicIpResponse allocatePublicIp(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("AllocatePublicIpAddress",
                new HashMap<String, String>() {
            { put("InstanceId", InstanceId); }
        }), AllolcatePublicIpResponse.class);
    }
    
    @SuppressWarnings("serial")
    public Response rebootInstance(final String InstanceId, final boolean ForceStop)
            throws AliyunClientException, AliyunServiceException {
    	
    	return gson.fromJson( request.execute("RebootInstance",
                new HashMap<String, String>() {
            { put("InstanceId", InstanceId);
            put("ForceStop", String.valueOf(ForceStop));}
        }), Response.class);
    }
    
    @SuppressWarnings("serial")
    public Response stopInstance(final String InstanceId, final boolean ForceStop)
            throws AliyunClientException, AliyunServiceException {
    	
    	return gson.fromJson( request.execute("StopInstance",
                new HashMap<String, String>() {
            { put("InstanceId", InstanceId);
            put("ForceStop", String.valueOf(ForceStop));}
        }), Response.class);
    }
    
    @SuppressWarnings("serial")
    public Response deleteInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	
    	return gson.fromJson( request.execute("DeleteInstance",
                new HashMap<String, String>() {
            { put("InstanceId", InstanceId);}
        }), Response.class);
    }
    
    public AddDiskResponse addDisk(final AddDiskRequest addDiskRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("AddDisk", addDiskRequest.toMap()), AddDiskResponse.class);
    }
    
    @SuppressWarnings("serial")
    public ListDisksResponse listDisks(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DescribeInstanceDisks",
                new HashMap<String, String>() {
                    { put("InstanceId", InstanceId); }
                }), ListDisksResponse.class);
    }

}
