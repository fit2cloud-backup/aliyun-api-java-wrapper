package com.fit2cloud.aliyun.rds;

import java.util.Map;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.PageableRequest;
import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.request.CreateAccountRequest;
import com.fit2cloud.aliyun.rds.model.request.CreateBackupRequest;
import com.fit2cloud.aliyun.rds.model.request.CreateDBInstanceRequest;
import com.fit2cloud.aliyun.rds.model.request.CreateDatabaseRequest;
import com.fit2cloud.aliyun.rds.model.request.CreateTempDBInstanceRequest;
import com.fit2cloud.aliyun.rds.model.request.DeleteAccountRequest;
import com.fit2cloud.aliyun.rds.model.request.DeleteDBInstanceRequest;
import com.fit2cloud.aliyun.rds.model.request.DeleteDatabaseRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeAccountsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeBackupPolicyRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeBackupsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeBinlogFilesRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeDBInstanceAttributeRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeDBInstancePerformanceRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeDBInstancesRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeDatabasesRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeErrorLogsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeOptimizeAdviceOnBigTableRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeOptimizeAdviceOnExcessIndexRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeOptimizeAdviceOnMissIndexRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeOptimizeAdviceOnMissPKRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeOptimizeAdviceOnStorageRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeParameterTemplatesRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeParametersRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeResourceUsageRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeSQLLogRecordsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeSQLLogReportsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeSlowLogRecordsRequest;
import com.fit2cloud.aliyun.rds.model.request.DescribeSlowLogsRequest;
import com.fit2cloud.aliyun.rds.model.request.GrantAccountPrivilegeRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyAccountDescriptionRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyBackupPolicyRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyDBDescriptionRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyDBInstanceDescriptionRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyDBInstanceMaintainTimeRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyDBInstanceSpecRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifyParameterRequest;
import com.fit2cloud.aliyun.rds.model.request.ModifySecurityIpsRequest;
import com.fit2cloud.aliyun.rds.model.request.PurgeDBInstanceLogRequest;
import com.fit2cloud.aliyun.rds.model.request.ResetAccountPasswordRequest;
import com.fit2cloud.aliyun.rds.model.request.RestartDBInstanceRequest;
import com.fit2cloud.aliyun.rds.model.request.RevokeAccountPrivilegeRequest;
import com.fit2cloud.aliyun.rds.model.request.SwitchDBInstanceNetTypeRequest;
import com.fit2cloud.aliyun.rds.model.request.UpgradeDBInstanceEngineVersionRequest;
import com.fit2cloud.aliyun.rds.model.response.CreateDBInstanceResponse;
import com.fit2cloud.aliyun.rds.model.response.CreateTempDBInstanceResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeAccountsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeBackupPolicyResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeBackupsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeBinlogFilesResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeDBInstanceAttributeResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeDBInstancePerformanceResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeDBInstancesResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeDatabasesResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeErrorLogsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeOptimizeAdviceOnBigTableResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeOptimizeAdviceOnExcessIndexResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeOptimizeAdviceOnMissIndexResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeOptimizeAdviceOnMissPKResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeOptimizeAdviceOnStorageResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeParameterTemplatesResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeParametersResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeRegionsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeResourceUsageResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeSQLLogRecordsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeSQLLogReportsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeSlowLogRecordsResponse;
import com.fit2cloud.aliyun.rds.model.response.DescribeSlowLogsResponse;
import com.fit2cloud.aliyun.rds.model.response.PageableResponse;
import com.fit2cloud.aliyun.rds.model.response.UpgradeDBInstanceEngineVersionResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class RDSClient 
{
    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    private RDSRequest request;

    public RDSClient(AliyunCredentials credentials){
    	request = new RDSRequest(credentials);
    }
    
    //************************************************ 实例管理 *******************************************************//
    
    public CreateDBInstanceResponse createDBInstance(final CreateDBInstanceRequest createDBInstanceRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("CreateDBInstance", createDBInstanceRequest.toMap()), CreateDBInstanceResponse.class);
    }
    
    public Response deleteDBInstance(final DeleteDBInstanceRequest deleteDBInstanceRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DeleteDBInstance", deleteDBInstanceRequest.toMap()), Response.class);
    }
    
    public Response modifyDBInstanceSpec(final ModifyDBInstanceSpecRequest modifyDBInstanceSpecRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("ModifyDBInstanceSpec", modifyDBInstanceSpecRequest.toMap()), Response.class);
    }
    
    public DescribeDBInstancesResponse describeDBInstances(final DescribeDBInstancesRequest describeDBInstancesRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return listPageableData(describeDBInstancesRequest, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }
    
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(final DescribeDBInstanceAttributeRequest describeDBInstanceAttributeRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DescribeDBInstanceAttribute", describeDBInstanceAttributeRequest.toMap()), DescribeDBInstanceAttributeResponse.class);
    }
    
	/**
	 * 必须满足以下条件,否则将修改失败: 
	 * 		1、 实例当前状态:使用中 
	 * 		2、 实例一天切换次数低于 20 次,按 24小时为一天计算,如上一次切换时间点为 2012-03-15 18:30:12,则下次切换时间点大于 2012-03-16 18:30:12。
	 * 
	 * @param switchDBInstanceNetTypeRequest
	 * @return
	 * @throws JsonSyntaxException
	 * @throws AliyunClientException
	 * @throws AliyunServiceException
	 */
    public Response switchDBInstanceNetType(final SwitchDBInstanceNetTypeRequest switchDBInstanceNetTypeRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("SwitchDBInstanceNetType", switchDBInstanceNetTypeRequest.toMap()), Response.class);
    }
    
    public Response restartDBInstance(final RestartDBInstanceRequest restartDBInstanceRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("RestartDBInstance", restartDBInstanceRequest.toMap()), Response.class);
    }
    
    public DescribeRegionsResponse describeRegions() throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeRegions", null), DescribeRegionsResponse.class);
    }
    
    public Response modifyDBInstanceDescription(final ModifyDBInstanceDescriptionRequest modifyDBInstanceDescriptionRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyDBInstanceDescription", modifyDBInstanceDescriptionRequest.toMap()), Response.class);
    }

    public Response modifySecurityIps(final ModifySecurityIpsRequest modifySecurityIpsRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifySecurityIps", modifySecurityIpsRequest.toMap()), Response.class);
    }

    public Response modifyDBInstanceMaintainTime(final ModifyDBInstanceMaintainTimeRequest modifyDBInstanceMaintainTimeRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyDBInstanceMaintainTime", modifyDBInstanceMaintainTimeRequest.toMap()), Response.class);
    }
    
    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersion(final UpgradeDBInstanceEngineVersionRequest upgradeDBInstanceEngineVersionRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("UpgradeDBInstanceEngineVersion", upgradeDBInstanceEngineVersionRequest.toMap()), UpgradeDBInstanceEngineVersionResponse.class);
    }

    public Response purgeDBInstanceLog(final PurgeDBInstanceLogRequest purgeDBInstanceLogRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("PurgeDBInstanceLog", purgeDBInstanceLogRequest.toMap()), Response.class);
    }
    
    
    //************************************************ 数据库管理 *******************************************************//
    
    public Response createDatabase(final CreateDatabaseRequest createDatabaseRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("CreateDatabase", createDatabaseRequest.toMap()), Response.class);
    }
 
    public Response deleteDatabase(final DeleteDatabaseRequest deleteDatabaseRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DeleteDatabase", deleteDatabaseRequest.toMap()), Response.class);
    }
    
    public DescribeDatabasesResponse describeDatabases(final DescribeDatabasesRequest describeDatabasesRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeDatabases", describeDatabasesRequest.toMap()), DescribeDatabasesResponse.class);
    }
    
    public Response modifyDBDescription(final ModifyDBDescriptionRequest modifyDBDescriptionRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyDBDescription", modifyDBDescriptionRequest.toMap()), Response.class);
    }

    
    //************************************************ 帐号管理 *******************************************************//
    
    public Response createAccount(final CreateAccountRequest createAccountRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("CreateAccount", createAccountRequest.toMap()), Response.class);
    }
    
    public Response resetAccountPassword(final ResetAccountPasswordRequest resetAccountPasswordRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ResetAccountPassword", resetAccountPasswordRequest.toMap()), Response.class);
    }
    
    public Response grantAccountPrivilege(final GrantAccountPrivilegeRequest grantAccountPrivilegeRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("GrantAccountPrivilege", grantAccountPrivilegeRequest.toMap()), Response.class);
    }
    
    public Response revokeAccountPrivilege(final RevokeAccountPrivilegeRequest revokeAccountPrivilegeRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("RevokeAccountPrivilege", revokeAccountPrivilegeRequest.toMap()), Response.class);
    }
    
    public DescribeAccountsResponse describeAccounts(final DescribeAccountsRequest describeAccountsRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeAccounts", describeAccountsRequest.toMap()), DescribeAccountsResponse.class);
    }
    
    public Response deleteAccount(final DeleteAccountRequest deleteAccountRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DeleteAccount", deleteAccountRequest.toMap()), Response.class);
    }
    
    public Response modifyAccountDescription(final ModifyAccountDescriptionRequest modifyAccountDescriptionRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyAccountDescription", modifyAccountDescriptionRequest.toMap()), Response.class);
    }
    

    //************************************************ 备份恢复 *******************************************************//
    
    public Response createBackup(final CreateBackupRequest createBackupRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("CreateBackup", createBackupRequest.toMap()), Response.class);
    }
    
    public DescribeBackupsResponse describeBackups(final DescribeBackupsRequest describeBackupsRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return listPageableData(describeBackupsRequest, "DescribeBackups", DescribeBackupsResponse.class);
    }
    
    public CreateTempDBInstanceResponse createTempDBInstance(final CreateTempDBInstanceRequest createTempDBInstanceRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("CreateTempDBInstance", createTempDBInstanceRequest.toMap()), CreateTempDBInstanceResponse.class);
    }
    
    public DescribeBackupPolicyResponse describeBackupPolicy(final DescribeBackupPolicyRequest describeBackupPolicyRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeBackupPolicy", describeBackupPolicyRequest.toMap()), DescribeBackupPolicyResponse.class);
    }
    
    public Response modifyBackupPolicy(final ModifyBackupPolicyRequest modifyBackupPolicyRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyBackupPolicy", modifyBackupPolicyRequest.toMap()), Response.class);
    }
    
    
    //************************************************ 监控查询 *******************************************************//
    
    public DescribeResourceUsageResponse describeResourceUsage(final DescribeResourceUsageRequest describeResourceUsageRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeResourceUsage", describeResourceUsageRequest.toMap()), DescribeResourceUsageResponse.class);
    }
    
    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(final DescribeDBInstancePerformanceRequest describeDBInstancePerformanceRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeDBInstancePerformance", describeDBInstancePerformanceRequest.toMap()), DescribeDBInstancePerformanceResponse.class);
    }
    

    //************************************************ 日志查询 *******************************************************//
    
    public DescribeErrorLogsResponse describeErrorLogs(final DescribeErrorLogsRequest describeErrorLogsRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeErrorLogsRequest, "DescribeErrorLogs", DescribeErrorLogsResponse.class);
    }
    
    public DescribeBinlogFilesResponse describeBinlogFiles(final DescribeBinlogFilesRequest describeBinlogFilesRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeBinlogFilesRequest, "DescribeBinlogFiles", DescribeBinlogFilesResponse.class);
    }
    
    public DescribeSQLLogRecordsResponse describeSQLLogRecords(final DescribeSQLLogRecordsRequest describeSQLLogRecordsRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeSQLLogRecordsRequest, "DescribeSQLLogRecords", DescribeSQLLogRecordsResponse.class);
    }
    

    //************************************************ 性能优化 *******************************************************//
    
    public DescribeSQLLogReportsResponse describeSQLLogReports(final DescribeSQLLogReportsRequest describeSQLLogReportsRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeSQLLogReportsRequest, "DescribeSQLLogReports", DescribeSQLLogReportsResponse.class);
    }
    
    public DescribeSlowLogsResponse describeSlowLogs(final DescribeSlowLogsRequest describeSlowLogsRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeSlowLogsRequest, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }
    
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(final DescribeSlowLogRecordsRequest describeSlowLogRecordsRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeSlowLogRecordsRequest, "DescribeSlowLogRecords", DescribeSlowLogRecordsResponse.class);
    }
    
    public DescribeOptimizeAdviceOnStorageResponse describeOptimizeAdviceOnStorage(final DescribeOptimizeAdviceOnStorageRequest describeOptimizeAdviceOnStorageRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeOptimizeAdviceOnStorageRequest, "DescribeOptimizeAdviceOnStorage", DescribeOptimizeAdviceOnStorageResponse.class);
    }
    
    public DescribeOptimizeAdviceOnBigTableResponse describeOptimizeAdviceOnBigTable(final DescribeOptimizeAdviceOnBigTableRequest describeOptimizeAdviceOnBigTableRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeOptimizeAdviceOnBigTableRequest, "DescribeOptimizeAdviceOnBigTable", DescribeOptimizeAdviceOnBigTableResponse.class);
    }
    
    public DescribeOptimizeAdviceOnMissPKResponse describeOptimizeAdviceOnMissPK(final DescribeOptimizeAdviceOnMissPKRequest describeOptimizeAdviceOnMissPKRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeOptimizeAdviceOnMissPKRequest, "DescribeOptimizeAdviceOnMissPK", DescribeOptimizeAdviceOnMissPKResponse.class);
    }
    
    public DescribeOptimizeAdviceOnExcessIndexResponse describeOptimizeAdviceOnExcessIndex(final DescribeOptimizeAdviceOnExcessIndexRequest describeOptimizeAdviceOnExcessIndexRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeOptimizeAdviceOnExcessIndexRequest, "DescribeOptimizeAdviceOnExcessIndex", DescribeOptimizeAdviceOnExcessIndexResponse.class);
    }
    
    public DescribeOptimizeAdviceOnMissIndexResponse describeOptimizeAdviceOnMissIndex(final DescribeOptimizeAdviceOnMissIndexRequest describeOptimizeAdviceOnMissIndexRequest) throws AliyunClientException, AliyunServiceException  {
    	return listPageableData(describeOptimizeAdviceOnMissIndexRequest, "DescribeOptimizeAdviceOnMissIndex", DescribeOptimizeAdviceOnMissIndexResponse.class);
    }
    

    //************************************************ 参数设置 *******************************************************//
    
    public DescribeParameterTemplatesResponse describeParameterTemplates(final DescribeParameterTemplatesRequest describeParameterTemplatesRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeParameterTemplates", describeParameterTemplatesRequest.toMap()), DescribeParameterTemplatesResponse.class);
    }
    
    public DescribeParametersResponse describeParameters(final DescribeParametersRequest describeParametersRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("DescribeParameters", describeParametersRequest.toMap()), DescribeParametersResponse.class);
    }
    
    public Response modifyParameter(final ModifyParameterRequest modifyParameterRequest) throws AliyunClientException, AliyunServiceException  {
    	return gson.fromJson(request.execute("ModifyParameter", modifyParameterRequest.toMap()), Response.class);
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
				if (count >= response.getTotalRecordCount()) {
					break;
				}
			}
			result.setPageNumber(1);
			result.setPageRecordCount(result.getTotalRecordCount());
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
