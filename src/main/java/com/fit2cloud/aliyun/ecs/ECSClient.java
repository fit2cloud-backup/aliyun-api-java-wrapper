package com.fit2cloud.aliyun.ecs;

import java.util.Map;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.PageableRequest;
import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.Response;
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
import com.fit2cloud.aliyun.ecs.model.request.DescribeInstancesRequest;
import com.fit2cloud.aliyun.ecs.model.request.DetachDiskRequest;
import com.fit2cloud.aliyun.ecs.model.request.GetInstanceRequest;
import com.fit2cloud.aliyun.ecs.model.request.JoinOrLeaveSecurityGroupRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListDisksRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListImagesRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListInstanceMonitorDataRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListInstancesRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSecurityGroupsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSecurityPermissionsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListSnapshotsRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListVRoutersRequest;
import com.fit2cloud.aliyun.ecs.model.request.ListVpcsRequest;
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
import com.fit2cloud.aliyun.ecs.model.response.DescribeInstancesResponse;
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
import com.fit2cloud.aliyun.ecs.model.response.ListVRoutersResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListVpcsResponse;
import com.fit2cloud.aliyun.ecs.model.response.ListZonesResponse;
import com.fit2cloud.aliyun.ecs.model.response.ReplaceSystemDiskResponse;
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
    
    /**
     * 查询可用的 Region 列表
     * 
     * @return	ListRegionsResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public ListRegionsResponse listRegions() throws AliyunClientException, AliyunServiceException  {
        return gson.fromJson(request.execute("DescribeRegions", null), ListRegionsResponse.class);
    }
    
    /**
     * 查询可用的可用区(Zone)列表
     * 
     * @param RegionId
     * @return	ListZonesResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public ListZonesResponse listZones(final String RegionId)
			throws AliyunClientException, AliyunServiceException {
		return listZones(new ListZonesRequest(RegionId));
	}
    
	/**
	 * 查询可用的可用区(Zone)列表
	 * 
	 * @param listZonesRequest
	 * @return	ListZonesResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListZonesResponse listZones(final ListZonesRequest listZonesRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("DescribeZones", listZonesRequest.toMap()),
				ListZonesResponse.class);
	}
	
	/**
	 * 查询用户可以使用的镜像列表。<br>
	 * 显示出的镜像资源列表包括用户自己私有的镜像,
	 * 阿里云提供系统资源,其他公共的镜像资源和镜像市场的镜像,镜像市场的镜像需要先到镜像市场的网站上订阅后才能进行创建云服务器实例。<br>
	 * 
	 * @param RegionId
	 * @return	ListImagesResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListImagesResponse listImages(final String RegionId)
			throws AliyunClientException, AliyunServiceException {
		return listImages(new ListImagesRequest(RegionId));
	}
	
	/**
	 * 查询用户可以使用的镜像列表。<br>
	 * 显示出的镜像资源列表包括用户自己私有的镜像,
	 * 阿里云提供系统资源,其他公共的镜像资源和镜像市场的镜像,镜像市场的镜像需要先到镜像市场的网站上订阅后才能进行创建云服务器实例。<br>
	 * 此接口支持分页查询,查询结果包括可使用的镜像资源的总数和当前页的镜像资源。每页的数量默认为 10 条。
	 * 
	 * @param listImagesRequest
	 * @return	ListImagesResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListImagesResponse listImages(
			final ListImagesRequest listImagesRequest)
			throws AliyunClientException, AliyunServiceException {
		return (ListImagesResponse) listPageableData(listImagesRequest, "DescribeImages", ListImagesResponse.class);
	}
	
	/**
	 * 查询用户定义的所有安全组基本信息
	 * 
	 * @param RegionId
	 * @return	ListSecurityGroupsResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListSecurityGroupsResponse listSecurityGroups(final String RegionId)
			throws AliyunClientException, AliyunServiceException {
		return listSecurityGroups(new ListSecurityGroupsRequest(RegionId));
	}
	
    /**
     * 分页查询用户定义的所有安全组基本信息。每页的数量默认为 10 条,数据按照安全组 ID 降序排列。
     * 
     * @param listSecurityGroupsRequest
     * @return	ListSecurityGroupsResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public ListSecurityGroupsResponse listSecurityGroups(
			final ListSecurityGroupsRequest listSecurityGroupsRequest)
			throws AliyunClientException, AliyunServiceException {
    	return (ListSecurityGroupsResponse) listPageableData(listSecurityGroupsRequest, "DescribeSecurityGroups", ListSecurityGroupsResponse.class);
	}
    
    /**
     * 新建一个安全组,通过安全组防火墙规则配置实现对一组实例的防火墙配置。一个安全组可包含多个实例。
     * <li>新建的安全组,默认只打开组内实例之间的访问权限,其他访问权限全部关闭。若用户允许其他组的实例或来自互联网的访问,则可通过授权安全组权限接口来对安全组防火墙策略进行修改。
     * <li>防火墙规则区分内网和公网。
     * <li>每个用户最多可创建 100 个安全组。
     * 
     * @param RegionId
     * @param Description
     * @return	CreateSecurityGroupsResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
	public CreateSecurityGroupsResponse createSecurityGroup(
			final String RegionId, final String Description)
			throws AliyunClientException, AliyunServiceException {
		return createSecurityGroup(new CreateSecurityGroupsRequest(RegionId,
				Description));
	}
    
	/**
	 * 新建一个安全组,通过安全组防火墙规则配置实现对一组实例的防火墙配置。一个安全组可包含多个实例。
     * <li>新建的安全组,默认只打开组内实例之间的访问权限,其他访问权限全部关闭。若用户允许其他组的实例或来自互联网的访问,则可通过授权安全组权限接口来对安全组防火墙策略进行修改。
     * <li>防火墙规则区分内网和公网。
     * <li>每个用户最多可创建 100 个安全组。
     * 
	 * @param createSecurityGroupsRequest
	 * @return	CreateSecurityGroupsResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public CreateSecurityGroupsResponse createSecurityGroup(
			final CreateSecurityGroupsRequest createSecurityGroupsRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("CreateSecurityGroup",
				createSecurityGroupsRequest.toMap()),
				CreateSecurityGroupsResponse.class);
	}
    
    /**
     * 设定安全组对外容许的访问权限,支持两种授权方式: 
     * <li>1、开放同一 region 内其他安全组对其的访问权限;
     * <li>2、开放指定某 IP 地址范围(CIDR 格式)对其的访问权限。
     * <br>
     * <li> 可支持的授权策略为:accept(接受访问)。
     * <li> 可支持不同的网络类型,如 NicType 可选择 internet 或 intranet,分别表示公网或内网。
     * <li> 单个安全组的授权规则最多为 100 条。
     * <li> 安全组的优先级根据创建的时间降序排序匹配。
     * <li> 组和组之间的授权只能在内网,即 NicType 只能选择 intranet。
     * <li> 安全组规则由两组可选参数中的一组组成: SourceGroupId、 IpProtocol、 PortRange、NicType、Policy 或者 SourceCidrIp、IpProtocol、PortRange、NicType、Policy。如匹配的规则已存在将会报错。
     * @param authorizeSecurityGroupRequest
     * @return	Response
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public Response authorizeSecurityGroup(final AuthorizeOrRevokeSecurityGroupRequest authorizeSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("AuthorizeSecurityGroup",	authorizeSecurityGroupRequest.toMap()), Response.class);
    } 
    
	/**
	 * 取消 Group 对外提供的访问权限。支持两种取消授权方式:一是取消本 Region 内其他
	 * 安全组采用指定协议通过指定端口访问访问本安全组;二是取消 IP 地址范围采用指定协议
	 * 通过指定端口访问本安全组,只有调用授权接口授权的权限条目才可以删除(参数值跟授权 时的参数相同)。<br>
	 * 安全组规则由两组可选参数中的一组组成:SourceGroupId、IpProtocol、PortRange、 NicType、Policy 或者
	 * SourceCidrIp、IpProtocol、PortRange、NicType、Policy。如匹配的规则 找不到将会报错。
	 * 
	 * @param revokeSecurityGroupRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response revokeSecurityGroup(final AuthorizeOrRevokeSecurityGroupRequest revokeSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("RevokeSecurityGroup", revokeSecurityGroupRequest.toMap()), Response.class);
    } 
    
    /**
     * 查询安全组详情,包括安全权限控制。
     * 
     * @param RegionId
     * @param SecurityGroupId
     * @return	ListSecurityPermissionsResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public ListSecurityPermissionsResponse listSecurityPermissions(
    		final String RegionId, final String SecurityGroupId)
			throws AliyunClientException, AliyunServiceException {
		return listSecurityPermissions(new ListSecurityPermissionsRequest(RegionId, SecurityGroupId));
	}
    
	/**
	 * 查询安全组详情,包括安全权限控制。
	 * 
	 * @param listSecurityPermissionsRequest
	 * @return	ListSecurityPermissionsResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListSecurityPermissionsResponse listSecurityPermissions(
			final ListSecurityPermissionsRequest listSecurityPermissionsRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DescribeSecurityGroupAttribute",
				listSecurityPermissionsRequest.toMap()),
				ListSecurityPermissionsResponse.class);
	}
    
	/**
	 * 用于删除一个指定的安全组。 
	 * <li>只有组内不存在实例,或者没有被其他组的安全规则引用时才可以删除
	 * 
	 * @param RegionId
	 * @param SecurityGroupId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteSecurityGroup(
			final String RegionId, final String SecurityGroupId)
			throws AliyunClientException, AliyunServiceException {
		return deleteSecurityGroup(new DeleteSecurityGroupRequest(RegionId, SecurityGroupId));
	}
	
	/**
	 * 用于删除一个指定的安全组。 
	 * <li>只有组内不存在实例,或者没有被其他组的安全规则引用时才可以删除
	 * 
	 * @param deleteSecurityGroupRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteSecurityGroup(
			final DeleteSecurityGroupRequest deleteSecurityGroupRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DeleteSecurityGroup",
				deleteSecurityGroupRequest.toMap()), Response.class);
	}
    
	/**
	 * 将实例加入到指定的安全组。 
	 * <li> 只有在实例状态为 Stopped 或 Running 状态下才可以执行该操作。 
	 * <li> 每个实例最多属于 5 个安全组
	 * <li> 每个安全组最多拥有个 1000 个实例
	 * 
	 * @param InstanceId
	 * @param SecurityGroupId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response joinSecurityGroup(final String InstanceId, final String SecurityGroupId) throws AliyunClientException, AliyunServiceException {
    	return joinSecurityGroup(new JoinOrLeaveSecurityGroupRequest(InstanceId, SecurityGroupId));
    }
	
	/**
	 * 将实例加入到指定的安全组。 
	 * <li> 只有在实例状态为 Stopped 或 Running 状态下才可以执行该操作。 
	 * <li> 每个实例最多属于 5 个安全组
	 * <li> 每个安全组最多拥有个 1000 个实例
	 * 
	 * @param joinOrLeaveSecurityGroupRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response joinSecurityGroup(final JoinOrLeaveSecurityGroupRequest joinOrLeaveSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("JoinSecurityGroup",
    			joinOrLeaveSecurityGroupRequest.toMap()), Response.class);
    }
    
	/**
	 * 将实例移出指定的安全组。 
	 * <li> 只有在实例状态为 Stopped 或 Running 状态下才可以执行该操作。 
	 * <li> 每个实例最少属于 1 个安全组,如果实例仅属于一个安全组,尝试移出时,请求会失败
	 * 
     * @param InstanceId
     * @param SecurityGroupId
     * @return	Response
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public Response leaveSecurityGroup(final String InstanceId, final String SecurityGroupId) throws AliyunClientException, AliyunServiceException {
    	return leaveSecurityGroup(new JoinOrLeaveSecurityGroupRequest(InstanceId, SecurityGroupId));
    }
    
    /**
	 * 将实例移出指定的安全组。 
	 * <li> 只有在实例状态为 Stopped 或 Running 状态下才可以执行该操作。 
	 * <li> 每个实例最少属于 1 个安全组,如果实例仅属于一个安全组,尝试移出时,请求会失败
	 * 
	 * @param joinOrLeaveSecurityGroupRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response leaveSecurityGroup(final JoinOrLeaveSecurityGroupRequest joinOrLeaveSecurityGroupRequest) throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("LeaveSecurityGroup",
    			joinOrLeaveSecurityGroupRequest.toMap()), Response.class);
    }
    
	/**
	 * 查询 ECS 所提供的实例资源规格列表。
	 * <li> 可以使用的规格与官网按量付费的类型一致,详情参考: http://help.aliyun.com/view/11108189_13545434.html 
	 * <li> 如果需要使用更多规格,可以通过阿里云工单系统提交扩容申请
	 * 
	 * @return	ListInstanceTypeResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListInstanceTypeResponse listInstanceType()
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DescribeInstanceTypes", null),
				ListInstanceTypeResponse.class);
	}
    
	/**
	 * 创建实例需要通过实名认证。没有通过实名认证的可以前往 www.aliyun.com 中的用户 中心-->会员信息中进行实名认证。<br>
	 * 
	 * 根据传入参数创建弹性计算实例。 
	 * <li> 在创建实例时,必须要选择镜像,用来确定新创建实例的系统盘配置。镜像包含操作系统以及应用软件配置,基于镜像创建实例后,实例的系统盘即为此镜像的完全克隆。
	 * <li> 一个实例创建时必须指定加入一个安全组。安全组需要预先创建,可通过创建安全组接口创建,可以在新创建实例时指定,也可通过修改实例属性的接口来完成实例所属安全组变更。
	 * 	在同一个安全组内的实例内网可以相互访问,但不同安全组之间默认有防火墙隔离,不可相互访问,但可通过安全组授权(通过授权安全组权限接口实现)来设置此安全组的防火墙权限。
	 * 	同一个安全组内的实例数量不能超过 1000 个,若组内实例数量超出限制,创建实例时若指定该安全组,会提示失败。 
	 * <li> 在创建实例时,如果参数 InternetChargeType 的值设置为 PayByBandwidth(按固定带宽付费),则 InternetMaxBandwidthOut 的设置值即为所选的固定带宽值;
	 * 	如果参数 InternetChargeType 的值设置为 PayByTraffic(按流量付费),则 InternetMaxBandwidthOut 只是一个带宽的上限设置,计费以发生的网络流量为依据。
	 * 	设置 InternetChargeType 和 InternetMaxBandwidthOut 时,应仔细核算可能发生的带宽费用。 
	 * <li> InternetMaxBandwidthIn 的值在任何情况下都与计费无关,实例的入数据流量是免费的。 
	 * <li> 实例创建时,系统会自己根据所指定的镜像为系统分配一个相应大小的系统盘。并且可以指定系统盘的种类:云磁盘、临时磁盘(如果您拥有开通临时磁盘的权限; 新接入用户默认没有此权限)。 
	 * <li> ECS 不支持单独创建或者添加临时磁盘,因此临时磁盘必须在创建实例时指定, 实例创建完成后不能再添加。各个实例规格对不同磁盘种类大小的限制见实例资源规格对照表。 
	 * <li> 单块云磁盘(cloud)容量最大不能超过 2000G,单块临时磁盘(ephemeral)容量最大不能超过 1T(1024G)。
	 * <li> 随实例创建的云磁盘(cloud),其 Portable 属性为 False,即不能卸载和挂载。所有创建的磁盘的 DeleteWithInstance 的属性为 True。 
	 * <li> 一个实例最多添加 4 块数据盘。一个实例的临时磁盘总容量不超过 2T (2008G) (不含系统盘) 
	 * <li> 选择了临时磁盘的实例,一旦创建后,不能修改实例规格。 
	 * <li> 实例内存为 512M 时不能使用 windows 操作系统;内存为 4G(含)以上时不能使用 32 位操作系统。 
	 * <li> 当系统盘是 cloud 时,数据盘不能是 ephemeral。
	 * 
	 * @param createInstanceRequest
	 * @return	CreateInstanceResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public CreateInstanceResponse createInstance(final CreateInstanceRequest createInstanceRequest) throws AliyunClientException, AliyunServiceException{
    	return gson.fromJson( request.execute("CreateInstance",	createInstanceRequest.toMap()), CreateInstanceResponse.class);
    }
    
    /**
     * 查询指定实例的详细信息
     * 
     * @param InstanceId
     * @return	GetInstanceResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public GetInstanceResponse getInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return getInstance(new GetInstanceRequest(InstanceId));
    }
    
    /**
     * 查询指定实例的详细信息
     * 
     * @param getInstanceRequest
     * @return	GetInstanceResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public GetInstanceResponse getInstance(final GetInstanceRequest getInstanceRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DescribeInstanceAttribute",
    			getInstanceRequest.toMap()), GetInstanceResponse.class);
    }
    
	/**
	 * 批量获取当前用户所有实例的状态信息,也可用于获取实例列表
	 * 
	 * @param RegionId
	 * @return	ListInstancesResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListInstancesResponse listInstances(final String RegionId)
			throws AliyunClientException, AliyunServiceException {
		return listInstances(new ListInstancesRequest(RegionId));
	}
	
	/**
	 * 批量获取当前用户所有实例的状态信息,也可用于获取实例列表
	 * 
	 * @param listInstancesRequest
	 * @return	ListInstancesResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListInstancesResponse listInstances(
			final ListInstancesRequest listInstancesRequest)
			throws AliyunClientException, AliyunServiceException {
		return (ListInstancesResponse) listPageableData(listInstancesRequest,
				"DescribeInstanceStatus", ListInstancesResponse.class);
	}
	
	public DescribeInstancesResponse describeInstances(
			final DescribeInstancesRequest describeInstancesRequest)
					throws AliyunClientException, AliyunServiceException {
		return (DescribeInstancesResponse) listPageableData(describeInstancesRequest,
				"DescribeInstances", DescribeInstancesResponse.class);
	}

	/**
	 * 启动一个指定的实例。
	 * <li> 接口调用成功后实例进入 Starting 状态。 
	 * <li> 实例状态必须为 Stopped,才可以调用该接口。 
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能启动实例
	 * 
	 * @param InstanceId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response startInstance(final String InstanceId)
			throws AliyunClientException, AliyunServiceException {
		return startInstance(new StartInstanceRequest(InstanceId));
	}
	
	/**
	 * 启动一个指定的实例。
	 * <li> 接口调用成功后实例进入 Starting 状态。 
	 * <li> 实例状态必须为 Stopped,才可以调用该接口。 
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能启动实例
	 * 
	 * @param startInstanceRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response startInstance(
			final StartInstanceRequest startInstanceRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("StartInstance", startInstanceRequest.toMap()),
				Response.class);
	}
    
    /**
     * 给一个特定实例分配一个可用公网 IP 地址。
     * <li>实例的状态必须为 Running 或 Stopped 状态,才可以调用此接口。
     * <li>分配的 IP 必须在实例启动或重启后才能生效。
     * <li>分配的时候只能是 IP,不能是 IP 段。
     * <li>目前,一个实例只能分配一个 IP。当调用此接口时,如果实例已经拥有一个公网 IP,将直接返回原 IP 地址。
     * <li>被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能分配公网 IP。
     * @param InstanceId
     * @return	AllocatePublicIpAddressResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public AllocatePublicIpAddressResponse allocatePublicIp(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return allocatePublicIp(new AllocatePublicIpAddressRequest(InstanceId));
    }
    
    /**
     * 给一个特定实例分配一个可用公网 IP 地址。
     * <li>实例的状态必须为 Running 或 Stopped 状态,才可以调用此接口。
     * <li>分配的 IP 必须在实例启动或重启后才能生效。
     * <li>分配的时候只能是 IP,不能是 IP 段。
     * <li>目前,一个实例只能分配一个 IP。当调用此接口时,如果实例已经拥有一个公网 IP,将直接返回原 IP 地址。
     * <li>被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能分配公网 IP。
     * @param allocatePublicIpAddressRequest
     * @return	AllocatePublicIpAddressResponse
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public AllocatePublicIpAddressResponse allocatePublicIp(final AllocatePublicIpAddressRequest allocatePublicIpAddressRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("AllocatePublicIpAddress",
    			allocatePublicIpAddressRequest.toMap()), AllocatePublicIpAddressResponse.class);
    }
    
	/**
	 * 停止一个指定的实例。该接口不强制停止实例
	 * 
	 * <li> 只有状态为 Running 的实例才可以进行此操作。 
	 * <li> 接口调用成功后实例进入 Stopping 状态。系统后台会在实例实际 Stop 成功后进入 Stopped 状态。 
	 * <li> 实例支持强制停止,强制停止等同于断电处理,可能丢失实例操作系统中未写入磁 盘的数据。 
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能停止实例。
	 * 
	 * @param InstanceId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response rebootInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return rebootInstance(new StopOrRebootInstanceRequest(InstanceId));
    }
    
    public Response rebootInstance(final StopOrRebootInstanceRequest stopOrRebootInstanceRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("RebootInstance",
    			stopOrRebootInstanceRequest.toMap()), Response.class);
    }
    
    /**
	 * 停止一个指定的实例。该接口不强制停止实例
	 * 
	 * <li> 只有状态为 Running 的实例才可以进行此操作。 
	 * <li> 接口调用成功后实例进入 Stopping 状态。系统后台会在实例实际 Stop 成功后进入 Stopped 状态。 
	 * <li> 实例支持强制停止,强制停止等同于断电处理,可能丢失实例操作系统中未写入磁 盘的数据。 
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能停止实例。
	 * 
     * @param InstanceId
     * @return	Response
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public Response stopInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return stopInstance(new StopOrRebootInstanceRequest(InstanceId));
    }
    
    /**
     * 停止一个指定的实例。
	 * 
	 * <li> 只有状态为 Running 的实例才可以进行此操作。 
	 * <li> 接口调用成功后实例进入 Stopping 状态。系统后台会在实例实际 Stop 成功后进入 Stopped 状态。 
	 * <li> 实例支持强制停止,强制停止等同于断电处理,可能丢失实例操作系统中未写入磁 盘的数据。 
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能停止实例。
	 * 
     * @param stopOrRebootInstanceRequest
     * @return	Response
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public Response stopInstance(final StopOrRebootInstanceRequest stopOrRebootInstanceRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("StopInstance",
    			stopOrRebootInstanceRequest.toMap()), Response.class);
    }
    
    /**
	 * 根据传入实例的名称来释放实例资源。释放后实例所使用的物理资源都被回收,包括磁盘及快照,相关数据全部丢失且永久不可恢复。 
	 * <li> 实例状态必须为 Stopped,才可以进行删除操作。删除后,实例的状态为 Deleted, 表示资源已释放,删除完成。 
	 * <li> 实例被删除时,挂载在实例上的 DeleteWithInstance 的属性为 True 的磁盘会相应被删除,这些磁盘的快照任旧保留,自动快照会被删除。 
	 * <li> 实例被删除后,相关数据全部丢失且永久不可恢复。 
	 * <li> 如果删除实例时,实例被安全控制在实例的 OperationLocks 中标记了"LockReason": "security"的锁定状态时,
	 * 	即使独立云磁盘的 DeleteWithInstnace 的属性为 False,系统会忽略这个属性而释放挂载在实例上面的云磁盘
	 * 
     * @param InstanceId
     * @return	Response
     * @throws AliyunClientException
     * @throws AliyunServiceException
     */
    public Response deleteInstance(final String InstanceId)
            throws AliyunClientException, AliyunServiceException {
    	return deleteInstance(new DeleteInstanceRequest(InstanceId));
    }
    
	/**
	 * 根据传入实例的名称来释放实例资源。释放后实例所使用的物理资源都被回收,包括磁盘及快照,相关数据全部丢失且永久不可恢复。 
	 * <li> 实例状态必须为 Stopped,才可以进行删除操作。删除后,实例的状态为 Deleted, 表示资源已释放,删除完成。 
	 * <li> 实例被删除时,挂载在实例上的 DeleteWithInstance 的属性为 True 的磁盘会相应被删除,这些磁盘的快照任旧保留,自动快照会被删除。 
	 * <li> 实例被删除后,相关数据全部丢失且永久不可恢复。 
	 * <li> 如果删除实例时,实例被安全控制在实例的 OperationLocks 中标记了"LockReason": "security"的锁定状态时,
	 * 	即使独立云磁盘的 DeleteWithInstnace 的属性为 False,系统会忽略这个属性而释放挂载在实例上面的云磁盘
	 * 
	 * @param deleteInstanceRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response deleteInstance(final DeleteInstanceRequest deleteInstanceRequest)
            throws AliyunClientException, AliyunServiceException {
    	return gson.fromJson( request.execute("DeleteInstance",
    			deleteInstanceRequest.toMap()), Response.class);
    }
    
	/**
	 * 修改实例密码、实例名称、安全组等属性信息。
	 * <li> 此操作只修改参数中显式指定了的属性,没有指定的属性将不会发生改变。
	 * <li> 重置实例的密码,状态为 Deleted 或 Starting 的实例不可以进行此操作。重置密码需要重启实例后才能生效。
	 * <li> 被安全控制在实例的 OperationLocks 中标记了”LockReason”: “security”的锁定状态时,不能修改密码。
	 * 
	 * @param modifyInstanceAttributeRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response modifyInstanceAttribute(
			final ModifyInstanceAttributeRequest modifyInstanceAttributeRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("ModifyInstanceAttribute",
				modifyInstanceAttributeRequest.toMap()), Response.class);
	}

	/**
	 * 创建磁盘需要通过实名认证。没有通过实名认证的可以前往 www.aliyun.com 中的用户中心-->会员信息中进行实名认证。<br>
	 * 
	 * 本接口是用于创建独立云磁盘的数据盘,系统盘的快照不能用来创建数据盘。
	 * 创建磁盘时,默认在删除磁盘时删除自动快照。收费方式为按量付费。<br>
	 * 
	 * 请求参数中“Size”和“SnapshotId”必须选择其中一项来指定磁盘的大小或使用快照创建磁盘。
	 * 
	 * @param createDiskRequest
	 * @return	CreateDiskResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public CreateDiskResponse createDisk(
			final CreateDiskRequest createDiskRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("CreateDisk", createDiskRequest.toMap()),
				CreateDiskResponse.class);
	}

	/**
	 * 查询磁盘
	 * 
	 * @param RegionId
	 * @return	ListDisksResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListDisksResponse listDisks(final String RegionId)
			throws AliyunClientException, AliyunServiceException {
		return listDisks(new ListDisksRequest(RegionId));
	}
	
	/**
	 * 下面的参数中,RegionId,ZoneId,Disks,InstanceId,...等参数都是过滤器的概念,参数间是逻辑与关系。<br>
	 * 其中 Disks 是一个 Json 格式的 Json Array,格式如下。<br>
	 * 
	 * DiskIds 的 Json string 格式:["d-xxxxxxxxx","d-yyyyyyyyy", ...,"d-zzzzzzzzz"],最多 10 个 Id,用半角逗号字符隔开。<br>
	 * 
	 * 如果参数为空,则过滤器不起作用,但是 Disks 如果是一个空 Json Array(即,[]),则视为该过滤器有效,且返回空。<br>
	 * 
	 * @param listDisksRequest
	 * @return	ListDisksResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListDisksResponse listDisks(final ListDisksRequest listDisksRequest)
			throws AliyunClientException, AliyunServiceException {
		return listPageableData(listDisksRequest, "DescribeDisks", ListDisksResponse.class);
	}

	/**
	 * 实例的状态必须为 running 或者 stopped,且实例的 OperationLocks 中没有标记"LockReason": "security"的锁定状态,且不欠费。<br>
	 * 
	 * 在该接口中设置的 DeleteWithInstance 属性,在实例的 OperationLocks 中标记为"LockReason": "security"的锁定状态时,
	 * 释放实例时会忽略磁盘的 DeleteWithInstance属性而被同时释放。
	 * 
	 * @param InstanceId
	 * @param DiskId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response attachDisk(final String InstanceId, final String DiskId)
			throws AliyunClientException, AliyunServiceException {
		return attachDisk(new AttachDiskRequest(InstanceId, DiskId));
	}
	
	/**
	 * 实例的状态必须为 running 或者 stopped,且实例的 OperationLocks 中没有标记"LockReason": "security"的锁定状态,且不欠费。<br>
	 * 
	 * 在该接口中设置的 DeleteWithInstance 属性,在实例的 OperationLocks 中标记为"LockReason": "security"的锁定状态时,
	 * 释放实例时会忽略磁盘的 DeleteWithInstance属性而被同时释放。
	 * 
	 * @param attachDiskRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response attachDisk(final AttachDiskRequest attachDiskRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("AttachDisk", attachDiskRequest.toMap()),
				Response.class);
	}

	/**
	 * Portable 属性为 True 的磁盘,且磁盘所挂载的实例的状态必须为 running 或者 stopped,
	 * 且实例的 OperationLocks 中没有标记"LockReason": "security"的锁定状态,磁盘可以执行此操作。<br>
	 * 
	 * 当一块云磁盘通过这个接口从一台实例上卸载后,DeleteWithInstance,会被置为 False。<br>
	 * 
	 * 如果 DiskId 的磁盘不挂载在 InstanceId 的实例上,该操作失败。
	 * 
	 * @param InstanceId
	 * @param DiskId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response detachDisk(final String InstanceId, final String DiskId)
			throws AliyunClientException, AliyunServiceException {
		return detachDisk(new DetachDiskRequest(InstanceId, DiskId));
	}
	
	/**
	 * Portable 属性为 True 的磁盘,且磁盘所挂载的实例的状态必须为 running 或者 stopped,
	 * 且实例的 OperationLocks 中没有标记"LockReason": "security"的锁定状态,磁盘可以执行此操作。<br>
	 * 
	 * 当一块云磁盘通过这个接口从一台实例上卸载后,DeleteWithInstance,会被置为 False。<br>
	 * 
	 * 如果 DiskId 的磁盘不挂载在 InstanceId 的实例上,该操作失败。
	 * 
	 * @param detachDiskRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response detachDisk(final DetachDiskRequest detachDiskRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("DetachDisk", detachDiskRequest.toMap()), Response.class);
	}

	/**
	 * 在该接口中设置的 DeleteWithInstance 属性,
	 * 在实例的 OperationLocks 中标记了"LockReason": "security"的锁定状态时,
	 * 释放实例时会忽略磁盘的 DeleteWithInstance属性而被同时释放。
	 * 
	 * @param modifyDiskAttributeRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response modifyDiskAttribute(
			final ModifyDiskAttributeRequest modifyDiskAttributeRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("ModifyDiskAttribute",
				modifyDiskAttributeRequest.toMap()), Response.class);
	}

	/**
	 * 当某个磁盘设备不再使用时,可以删除磁盘。但是只能删除独立云磁盘。
	 * 
	 * <li> 删除磁盘时磁盘的 status 必须为 Available。
	 * <li> 如果指定 ID 的磁盘不存在,请求将被忽略。
	 * <li> 由于用户快照会被保留,自动快照会被删除,请及时删除不必要的孤立用户快照和自动快照(即磁盘已经被删除的快照),以保持足够的快照额度来顺利完成周期性的自动快照策略。
	 * 
	 * @param DiskId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteDisk(final String DiskId)
			throws AliyunClientException, AliyunServiceException {
		return deleteDisk(new DeleteOrReInitDiskRequest(DiskId));
	}
	
	/**
	 * 当某个磁盘设备不再使用时,可以删除磁盘。但是只能删除独立云磁盘。
	 * 
	 * <li> 删除磁盘时磁盘的 status 必须为 Available。
	 * <li> 如果指定 ID 的磁盘不存在,请求将被忽略。
	 * <li> 由于用户快照会被保留,自动快照会被删除,请及时删除不必要的孤立用户快照和自动快照(即磁盘已经被删除的快照),以保持足够的快照额度来顺利完成周期性的自动快照策略。
	 * 
	 * @param deleteDiskRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteDisk(final DeleteOrReInitDiskRequest deleteDiskRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("DeleteDisk", deleteDiskRequest.toMap()), Response.class);
	}
	
	/**
	 * 重新初始化磁盘到初始状态
	 * <li> 磁盘状态必须为使用中(In_use)的状态,且实例状态必须为 Stopped 时,才能执行此操作。
	 * 但是如果实例创建后在第一次启动前,挂载在其上的磁盘也不能重新初始化。<br>
	 * 
	 * 调用此接口,磁盘恢复到创建时的初始状态,即:
	 * <li> 如果为数据盘且是直接创建的空盘,则初始化到空盘状态
	 * <li> 如果为数据盘且是通过快照创建的,则初始化到快照状态
	 * <li> 如果为系统盘,则初始化到镜像的初始状态
	 * 
	 * @param DiskId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response reInitDisk(final String DiskId) throws AliyunClientException, AliyunServiceException {
		return reInitDisk(new DeleteOrReInitDiskRequest(DiskId));
	}
	
	/**
	 * 重新初始化磁盘到初始状态
	 * <li> 磁盘状态必须为使用中(In_use)的状态,且实例状态必须为 Stopped 时,才能执行此操作。
	 * 但是如果实例创建后在第一次启动前,挂载在其上的磁盘也不能重新初始化。<br>
	 * 
	 * 调用此接口,磁盘恢复到创建时的初始状态,即:
	 * <li> 如果为数据盘且是直接创建的空盘,则初始化到空盘状态
	 * <li> 如果为数据盘且是通过快照创建的,则初始化到快照状态
	 * <li> 如果为系统盘,则初始化到镜像的初始状态
	 * 
	 * @param reInitDiskRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response reInitDisk(final DeleteOrReInitDiskRequest reInitDiskRequest) throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("ReInitDisk", reInitDiskRequest.toMap()), Response.class);
	}
	
	/**
	 * 使用指定磁盘自身的快照回滚磁盘内容。
	 * <li> 实例状态必须为 Stopped 时,才可以执行此操作。
	 * <li> 磁盘状态必须为使用中(In_use)的状态,才能执行此操作。
	 * <li> 指定的 SnapshotId 必须是有 DiskId 创建的快照,否则报错。
	 * <li> 实例的 OperationLocks 中标记了"LockReason": "security"的锁定状态,则报错。
	 * 
	 * @param DiskId
	 * @param SnapshotId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response resetDisk(final String DiskId, final String SnapshotId)
			throws AliyunClientException, AliyunServiceException {
		return resetDisk(new ResetDiskRequest(DiskId, SnapshotId));
	}
	
	/**
	 * 使用指定磁盘自身的快照回滚磁盘内容。
	 * <li> 实例状态必须为 Stopped 时,才可以执行此操作。
	 * <li> 磁盘状态必须为使用中(In_use)的状态,才能执行此操作。
	 * <li> 指定的 SnapshotId 必须是有 DiskId 创建的快照,否则报错。
	 * <li> 实例的 OperationLocks 中标记了"LockReason": "security"的锁定状态,则报错。
	 * 
	 * @param resetDiskRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response resetDisk(final ResetDiskRequest resetDiskRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("ResetDisk", resetDiskRequest.toMap()), Response.class);
	}
	
	/**
	 * 更换系统盘会改变这台云服务器的系统盘的磁盘 ID。更换系统盘时,不改变系统盘的磁盘种类和付费方式。<br>
	 * 原系统盘将被删除,同时原系统盘的自动快照会被删除,但用户快照保留。<br>
	 * 
	 * 实例的状态必须为 Stopped 状态,且实例的 OperationLocks 中没有标记"LockReason":"security"的锁定状态,且不欠费。<br>
	 * 
	 * 用户输入镜像 ID 进行更换系统盘,需要增加限制:
	 * <li> 如果没有订阅该镜像需要返回错误 code 和错误信息:您没有订阅该镜像无法更换系统盘。请访问镜像市场进行订阅(镜像市场的连接)。
	 * <li> 如果镜像已经下架,返回错误 code 和错误信息:该镜像已经下架无法进行更换系统盘。
	 * <li> 如果镜像是用户自定义镜像,但是该镜像存在 productcode,如果该镜像已经下线,也是可以为该实例更换系统盘的。
	 * <li> 由于原系统盘的用户快照会被保留,自动快照可以选择保留,请及时删除不必要的孤立用户快照和自动快照(即磁盘已经被删除的快照),以保持足够的快照额度来顺利完成周期性的自动快照策略。
	 * 
	 * @param InstanceId
	 * @param ImageId
	 * @return	ReplaceSystemDiskResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ReplaceSystemDiskResponse replaceSystemDisk(final String InstanceId,
			final String ImageId) throws AliyunClientException,
			AliyunServiceException {
		return replaceSystemDisk(new ReplaceSystemDiskRequest(InstanceId, ImageId));
	}
	
	/**
	 * 更换系统盘会改变这台云服务器的系统盘的磁盘 ID。更换系统盘时,不改变系统盘的磁盘种类和付费方式。<br>
	 * 原系统盘将被删除,同时原系统盘的自动快照会被删除,但用户快照保留。<br>
	 * 
	 * 实例的状态必须为 Stopped 状态,且实例的 OperationLocks 中没有标记"LockReason":"security"的锁定状态,且不欠费。<br>
	 * 
	 * 用户输入镜像 ID 进行更换系统盘,需要增加限制:
	 * <li> 如果没有订阅该镜像需要返回错误 code 和错误信息:您没有订阅该镜像无法更换系统盘。请访问镜像市场进行订阅(镜像市场的连接)。
	 * <li> 如果镜像已经下架,返回错误 code 和错误信息:该镜像已经下架无法进行更换系统盘。
	 * <li> 如果镜像是用户自定义镜像,但是该镜像存在 productcode,如果该镜像已经下线,也是可以为该实例更换系统盘的。
	 * <li> 由于原系统盘的用户快照会被保留,自动快照可以选择保留,请及时删除不必要的孤立用户快照和自动快照(即磁盘已经被删除的快照),以保持足够的快照额度来顺利完成周期性的自动快照策略。
	 * 
	 * @param replaceSystemDiskRequest
	 * @return	ReplaceSystemDiskResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ReplaceSystemDiskResponse replaceSystemDisk(final ReplaceSystemDiskRequest replaceSystemDiskRequest) throws AliyunClientException,
			AliyunServiceException {
		return gson.fromJson(request.execute("ReplaceSystemDisk",
				replaceSystemDiskRequest.toMap()), ReplaceSystemDiskResponse.class);
	}
	
	/**
	 * 对指定的磁盘存储设备创建快照。
	 * <li> 云服务器仅在 Stopped 或 Running 状态下才能创建快照。(但刚创建完成从未启动过的实例不能创建快照)
	 * <li> 刚创建完成的云服务器系统盘,或刚增加从快照创建的数据盘,由于尚未完成数据的加载,此时创建快照会返回错误。
	 * 	 一般来说,系统盘创建完成 1 个小时后即可创建快照,数据盘的可创建快照的时间取决于磁盘数据的大小。
	 * <li> 新增加一块磁盘后,如果实例尚未启动过,新增的这块磁盘不能用于创建快照。
	 * <li> 如果快照创建没有完成(即进度没有达到 100%),那么这个快照无法用于创建自定义镜像。
	 * <li> 如果快照创建没有完成(即进度没有达到 100%),那么不能对同一磁盘再次创建快照。
	 * <li> 快照数量的配额取决于该帐号下拥有的磁盘总数量。最多可创建的快照数量为磁盘数量乘以 6+6。
	 * <li> 如果磁盘在 In_use 状态下,挂载的实例的 OperationLocks 中标记了"LockReason":"security"的锁定状态时,不能创建快照。
	 * <li> 磁盘挂载的实例创建后第一次启动前,不能创建快照
	 * <li> 独立云磁盘创建后,如果没有挂载过,创建快照会出现错误提示。
	 * 
	 * @param createSnapshotRequest
	 * @return	CreateSnapshotResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public CreateSnapshotResponse createSnapshot(
			CreateSnapshotRequest createSnapshotRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("CreateSnapshot",
				createSnapshotRequest.toMap()), CreateSnapshotResponse.class);
	}
	
	/**
	 * 删除指定实例、指定磁盘设备的快照。如果需要取消创建中的快照(即快照进度尚未达到 100%),也可以调用该进口将快照删除(即取消快照创建)。
	 * <li> 如果指定 ID 的快照不存在,请求将被忽略。
	 * <li> 如果快照已经被用于创建自定义镜像,则这个快照不能被删除。需要先删除相应的自定义镜像,快照才能被删除。
	 * 
	 * @param SnapshotId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteSnapshot(final String SnapshotId)
			throws AliyunClientException, AliyunServiceException {
		return deleteSnapshot(new DeleteSnapshotRequest(SnapshotId));
	}
	
	/**
	 * 删除指定实例、指定磁盘设备的快照。如果需要取消创建中的快照(即快照进度尚未达到 100%),也可以调用该进口将快照删除(即取消快照创建)。
	 * <li> 如果指定 ID 的快照不存在,请求将被忽略。
	 * <li> 如果快照已经被用于创建自定义镜像,则这个快照不能被删除。需要先删除相应的自定义镜像,快照才能被删除。
	 * 
	 * @param deleteSnapshotRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteSnapshot(final DeleteSnapshotRequest deleteSnapshotRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DeleteSnapshot",
				deleteSnapshotRequest.toMap()), Response.class);
	}
	
	public ListSnapshotsResponse listSnapshots(final String RegionId)
            throws AliyunClientException, AliyunServiceException {
		return listSnapshots(new ListSnapshotsRequest(RegionId));
	}
	
	/**
	 * 查询针对云服务器的某个磁盘设备所有的快照列表。<br>
	 * 
	 * InstanceId,DiskId 和 SnapshotId 不再作为必选参数,而是作为 Filter 进行使用,为逻辑与关系。<br>
	 * 
	 * 其中 SnapshotIds 的 Json string 格式为:["s-xxxxxxxxx","s-yyyyyyyyy", ... "s-zzzzzzzzz"],
	 * 最多 10 个 Id,用半角逗号字符隔开。
	 * 
	 * @param listSnapshotsRequest
	 * @return	ListSnapshotsResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListSnapshotsResponse listSnapshots(final ListSnapshotsRequest listSnapshotsRequest)
            throws AliyunClientException, AliyunServiceException {
		return (ListSnapshotsResponse) listPageableData(listSnapshotsRequest, "DescribeSnapshots", ListSnapshotsResponse.class);
	}
	
	/**
	 * 自动快照策略是对您所有地域的磁盘(独立云磁盘,云磁盘和临时磁盘)有效。 <br>
	 * 
	 * 操作只修改显式给定的参数,没有给定的参数将不会被修改。<br>
	 * 
	 * 自动快照策略只在磁盘处于 In_use 状态时才执行,对于磁盘的其他状态,自动快照策 略将不执行。<br>
	 * 
	 * 自动快照是以 auto 开头的 SnapshotName。<br>
	 * 
	 * 当快照额度不足以完成一次自动快照策略时,设置将不成功。可以通过: 
	 * <li> 删除不必要的用户快照(通过CreateSnapshot 创建的快照)腾出快照额度,但是删 除自动快照本身并不能帮助自动快照策略的持续执行
	 * <li> 减少自动快照保留的天数,即减少自动快照占用的额度
	 * 
	 * @param modifyAutoSnapshotPolicyRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response modifyAutoSnapshotPolicy(
			final ModifyAutoSnapshotPolicyRequest modifyAutoSnapshotPolicyRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("ModifyAutoSnapshotPolicy",
				modifyAutoSnapshotPolicyRequest.toMap()), Response.class);
	}
	
	/**
	 * 当快照额度不足以完成一次自动快照策略时,设置将不成功。可以通过: 
	 * <li> 删除不必要的用户快照(通过 CreateSnapshot创建的快照)腾出快照额度,但是删除自动快照本身并不能帮助自动快照策略的持续执行 </li>
	 * <li> 减少自动快照保留的天数,即减少自动快照占用的额度</li>
	 * 
	 * @return	ListAutoSnapshotPolicyResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListAutoSnapshotPolicyResponse listAutoSnapshotPolicy()
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("DescribeAutoSnapshotPolicy", null),
				ListAutoSnapshotPolicyResponse.class);
	}
	
	/**
	 * 通过快照创建自定义镜像,创建后的镜像可以用于新建 ECS 实例。
	 * <li>只有系统盘的快照可以用于创建自定义镜像。 
	 * <li>只有达到完成状态(进度为 100%)的快照可以用于创建自定义镜像。 
	 * <li>被安全控制在实例的 OperationLocks 中标记了”LockReason”:“security”的锁定状态时,不能创建自定义镜像。
	 * <li>2013 年 7 月 15 日(含)之前创建的快照,不能创建自定义镜像。当 Request 因此原因被拒绝时,Response 中的 code 为 InvalidSnapshot.TooOld 。
	 * 
	 * @param createImageRequest
	 * @return	CreateImageResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public CreateImageResponse createImage(
			final CreateImageRequest createImageRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("CreateImage", createImageRequest.toMap()),
				CreateImageResponse.class);
	}
	
	/**
	 * 删除指定的用户自定义镜像。镜像删除之后将不能再用于创建、重置 ECS 实例。 
	 * <li>如果指定的镜像不存在,则请求将被忽略。
	 * 
	 * @param regionId
	 * @param imageId
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteImage(final String regionId, final String imageId)
			throws AliyunClientException, AliyunServiceException {
		return deleteImage(new DeleteImageRequest(regionId, imageId));
	}
	
	/**
	 * 删除指定的用户自定义镜像。镜像删除之后将不能再用于创建、重置 ECS 实例。 
	 * <li>如果指定的镜像不存在,则请求将被忽略。
	 * 
	 * @param deleteImageRequest
	 * @return	Response
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public Response deleteImage(final DeleteImageRequest deleteImageRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(
				request.execute("DeleteImage", deleteImageRequest.toMap()),
				Response.class);
	}
	
	/**
	 * 分页查询本用户的所有云服务器相关的监控信息。 
	 * <li> 只能查询到状态非 Deleted 或者非刚刚创建完成尚处于 Stopped 状态的云服务器的监控信息。
	 * <li> 可返回的监控内容包括:云服务器的 CPU 使用率、云服务器分配到的内存数、云服务器接收到的数据流量、云服务器发送的数据流量、云服务器网络流量、云服务器平均带宽。
	 * 	有可能返回的监控内容中会缺少部分内部,这可能是由于系统没有获得到相应的信息,比如当时实例处于 Stopped 状态。 
	 * <li> 一次最大只容许返回 50 条监控数据,如果指定的(EndTime – StartTime)/Peroid > 50,则返回错误。
	 * 
	 * @param listInstanceMonitorDataRequest
	 * @return	ListInstanceMonitorDataResponse
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
	public ListInstanceMonitorDataResponse listInstanceMonitorData(
			final ListInstanceMonitorDataRequest listInstanceMonitorDataRequest)
			throws AliyunClientException, AliyunServiceException {
		return gson.fromJson(request.execute("DescribeInstanceMonitorData",
				listInstanceMonitorDataRequest.toMap()),
				ListInstanceMonitorDataResponse.class);
	}
	
	
	public ListVpcsResponse listVpcs(
			final ListVpcsRequest listVpcsRequest)
			throws AliyunClientException, AliyunServiceException {
		return (ListVpcsResponse) listPageableData(listVpcsRequest,
				"DescribeVpcs", ListVpcsResponse.class);
	}
	
	public ListVRoutersResponse listVRouters(
			final ListVRoutersRequest listVRoutersRequest)
					throws AliyunClientException, AliyunServiceException {
		return (ListVRoutersResponse) listPageableData(listVRoutersRequest,
				"DescribeVRouters", ListVRoutersResponse.class);
	}
	
	
	
	
	
	
	
	private <T extends PageableResponse> T listPageableData(
			final PageableRequest pageableRequest, final String action, Class<T> responseClass)
			throws AliyunClientException, AliyunServiceException {
		boolean requestAll = false;
		if (pageableRequest.getPageNumber() == null
				&& pageableRequest.getPageSize() == null) {
			requestAll = true;
		}
		int pageNumber = pageableRequest.getPageNumber() == null ? 1
				: pageableRequest.getPageNumber();
		int pageSize = pageableRequest.getPageSize() == null ? 50
				: pageableRequest.getPageSize();
		int count = 0;

		T result = null;
		try {
			result = responseClass.newInstance();
			while (true) {
				Map<String, String> params = pageableRequest.toMap();
				params.put("PageNumber", String.valueOf(pageNumber++));
				params.put("pageSize", String.valueOf(pageSize));
				T response = gson.fromJson(
						request.execute(action, params),
						responseClass);
				if (!requestAll) {
					return response;
				}
				result.add(response);
				count += pageSize;
				if (count >= response.getTotalCount()) {
					break;
				}
			}
			result.setPageNumber(1);
			result.setPageSize(result.getTotalCount());
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;
	}
}
