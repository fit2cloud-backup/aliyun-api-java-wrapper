package com.fit2cloud.aliyun;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.RDSClient;
import com.fit2cloud.aliyun.rds.model.AccountPrivilege;
import com.fit2cloud.aliyun.rds.model.BackupMethod;
import com.fit2cloud.aliyun.rds.model.BackupType;
import com.fit2cloud.aliyun.rds.model.CharacterSet;
import com.fit2cloud.aliyun.rds.model.DBInstanceClassType;
import com.fit2cloud.aliyun.rds.model.DBInstanceNetType;
import com.fit2cloud.aliyun.rds.model.DBInstanceType;
import com.fit2cloud.aliyun.rds.model.DBStatus;
import com.fit2cloud.aliyun.rds.model.EngineType;
import com.fit2cloud.aliyun.rds.model.EngineVersion;
import com.fit2cloud.aliyun.rds.model.PayType;
import com.fit2cloud.aliyun.rds.model.Performance;
import com.fit2cloud.aliyun.rds.model.PreferredBackupPeriod;
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
import com.google.gson.Gson;

public class AliyunRDSClientTest {

	private RDSClient client;

	@Before
	public void setUp() throws Exception {
		String ACCESS_KEY_ID = "YOUR_ACCESS_KEY";
    	String ACCESS_KEY_SECRET = "YOUR_SECRET_KEY";
    	client = new RDSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	}
	
	String dBInstanceId = "rdsnfrqjmvjyyqi";
	String dbName = "test_db";
	String accountName = "tester";
	String region = "cn-qingdao";
	
	@Test
	public void testCreateDBInstance() {
		try {
			CreateDBInstanceRequest request = new CreateDBInstanceRequest();
			request.setDBInstanceClass(DBInstanceClassType.MYSQL_SMALL);
			request.setDBInstanceDescription("created by api");
			request.setDBInstanceNetType(DBInstanceNetType.INTERNET);
			request.setDBInstanceStorage(5);
			request.setEngine(EngineType.MYSQL);
			request.setEngineVersion(EngineVersion.MYSQL_5_5);
			request.setPayType(PayType.POST_PAID);
			request.setRegionId(region);
			request.setSecurityIPList("0.0.0.0/0");
			String clientToken = UUID.randomUUID().toString();
			request.setClientToken(clientToken);
			Response response = client.createDBInstance(request);
			System.out.println("testCreateDBInstance :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteDBInstance() {
		try {
			DeleteDBInstanceRequest request = new DeleteDBInstanceRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.deleteDBInstance(request);
			System.out.println("testDeleteDBInstance :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyDBInstanceSpec() {
		try {
			ModifyDBInstanceSpecRequest request = new ModifyDBInstanceSpecRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setDBInstanceStorage(10);
//			request.setDBInstanceClass(DBInstanceClassType.MYSQL_MID);
			request.setPayType(PayType.POST_PAID);
			Response response = client.modifyDBInstanceSpec(request);
			System.out.println("testModifyDBInstanceSpec :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeDBInstances() {
		try {
			DescribeDBInstancesRequest request = new DescribeDBInstancesRequest();
			request.setDBInstanceType(DBInstanceType.ALL);
			request.setEngine(EngineType.MYSQL);
			request.setRegionId(region);
			Response response = client.describeDBInstances(request);
			System.out.println("testDescribeDBInstances :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeDBInstanceAttribute() {
		try {
			DescribeDBInstanceAttributeRequest request = new DescribeDBInstanceAttributeRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeDBInstanceAttribute(request);
			System.out.println("testDescribeDBInstanceAttribute :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testSwitchDBInstanceNetType() {
		try {
			SwitchDBInstanceNetTypeRequest request = new SwitchDBInstanceNetTypeRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setConnectionStringPrefix("testf2c");
			request.setPort(3333);
			Response response = client.switchDBInstanceNetType(request);
			System.out.println("testSwitchDBInstanceNetType :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testRestartDBInstance() {
		try {
			RestartDBInstanceRequest request = new RestartDBInstanceRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.restartDBInstance(request);
			System.out.println("testRestartDBInstance :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeRegions() {
		try {
			Response response = client.describeRegions();
			System.out.println("testdDescribeRegions :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyDBInstanceDescription() {
		try {
			ModifyDBInstanceDescriptionRequest request = new ModifyDBInstanceDescriptionRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setDBInstanceDescription("new description");
			Response response = client.modifyDBInstanceDescription(request);
			System.out.println("testdModifyDBInstanceDescription :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifySecurityIps() {
		try {
			ModifySecurityIpsRequest request = new ModifySecurityIpsRequest();
			request.setDBInstanceId(dBInstanceId);
			String securityIps = "111.111.111.111,10.10.0.0/24";
			request.setSecurityIps(securityIps );
			Response response = client.modifySecurityIps(request);
			System.out.println("testModifySecurityIps :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyDBInstanceMaintainTime() {
		try {
			ModifyDBInstanceMaintainTimeRequest request = new ModifyDBInstanceMaintainTimeRequest();
			request.setDBInstanceId(dBInstanceId);
			String maintainTime = "22:00Z-02:00Z";
			request.setMaintainTime(maintainTime);
			Response response = client.modifyDBInstanceMaintainTime(request);
			System.out.println("testModifyDBInstanceMaintainTime :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testUpgradeDBInstanceEngineVersion() {
		try {
			UpgradeDBInstanceEngineVersionRequest request = new UpgradeDBInstanceEngineVersionRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setEngineVersion(EngineVersion.MYSQL_5_6);
			Response response = client.upgradeDBInstanceEngineVersion(request);
			System.out.println("testUpgradeDBInstanceEngineVersion :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testPurgeDBInstanceLog() {
		try {
			PurgeDBInstanceLogRequest request = new PurgeDBInstanceLogRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.purgeDBInstanceLog(request);
			System.out.println("testPurgeDBInstanceLog :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateDatabase() {
		try {
			CreateDatabaseRequest request = new CreateDatabaseRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setCharacterSetName(CharacterSet.MYSQL_UTF8);
			request.setDBDescription("test description");
			request.setDBName(dbName);
			Response response = client.createDatabase(request);
			System.out.println("testCreateDatabase :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteDatabase() {
		try {
			DeleteDatabaseRequest request = new DeleteDatabaseRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setDBName(dbName);
			Response response = client.deleteDatabase(request);
			System.out.println("testDeleteDatabase :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeDatabases() {
		try {
			DescribeDatabasesRequest request = new DescribeDatabasesRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setDBName(dbName);
			request.setDBStatus(DBStatus.RUNNING);
			Response response = client.describeDatabases(request);
			System.out.println("testDescribeDatabases :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModifyDBDescription() {
		try {
			ModifyDBDescriptionRequest request = new ModifyDBDescriptionRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setDBName(dbName);
			request.setDBDescription("new description");
			Response response = client.modifyDBDescription(request);
			System.out.println("testModifyDBDescription :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateAccount() {
		try {
			CreateAccountRequest request = new CreateAccountRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountDescription("account description");
			request.setAccountName(accountName);
			request.setAccountPassword("bstcloudp1");
			Response response = client.createAccount(request);
			System.out.println("testCreateAccount :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testResetAccountPassword() {
		try {
			ResetAccountPasswordRequest request = new ResetAccountPasswordRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountName(accountName);
			request.setAccountPassword("bstcloudp2");
			Response response = client.resetAccountPassword(request);
			System.out.println("testResetAccountPassword :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testGrantAccountPrivilege() {
		try {
			GrantAccountPrivilegeRequest request = new GrantAccountPrivilegeRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountName(accountName);
			request.setAccountPrivilege(AccountPrivilege.READWRITE);
			request.setDBName(dbName);
			Response response = client.grantAccountPrivilege(request);
			System.out.println("testGrantAccountPrivilege :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testRevokeAccountPrivilege() {
		try {
			RevokeAccountPrivilegeRequest request = new RevokeAccountPrivilegeRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountName(accountName);
			request.setDBName(dbName);
			Response response = client.revokeAccountPrivilege(request);
			System.out.println("testRevokeAccountPrivilege :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeAccounts() {
		try {
			DescribeAccountsRequest request = new DescribeAccountsRequest();
			request.setDBInstanceId(dBInstanceId);
//			request.setAccountName(accountName);
			Response response = client.describeAccounts(request);
			System.out.println("testDescribeAccounts :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeleteAccount() {
		try {
			DeleteAccountRequest request = new DeleteAccountRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountName(accountName);
			Response response = client.deleteAccount(request);
			System.out.println("testDeleteAccount :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyAccountDescription() {
		try {
			ModifyAccountDescriptionRequest request = new ModifyAccountDescriptionRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setAccountName(accountName);
			request.setAccountDescription("new description");
			Response response = client.modifyAccountDescription(request);
			System.out.println("testModifyAccountDescription :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateBackup() {
		try {
			CreateBackupRequest request = new CreateBackupRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setBackupMethod(BackupMethod.LOGICAL);
			request.setBackupType(BackupType.AUTO);
			Response response = client.createBackup(request);
			System.out.println("testCreateBackup :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDescribeBackups() {
		try {
			DescribeBackupsRequest request = new DescribeBackupsRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setPageNumber(1);
			request.setPageSize(30);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			Response response = client.describeBackups(request);
			System.out.println("testDescribeBackups :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreateTempDBInstance() {
		try {
			CreateTempDBInstanceRequest request = new CreateTempDBInstanceRequest();
			request.setDBInstanceId(dBInstanceId);
			Integer backupId = 47707957;
			request.setBackupId(backupId);
			Response response = client.createTempDBInstance(request);
			System.out.println("testCreateTempDBInstance :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeBackupPolicy() {
		try {
			DescribeBackupPolicyRequest request = new DescribeBackupPolicyRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeBackupPolicy(request);
			System.out.println("testDescribeBackupPolicy :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyBackupPolicy() {
		try {
			ModifyBackupPolicyRequest request = new ModifyBackupPolicyRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setPreferredBackupPeriod(PreferredBackupPeriod.MONDAY);
			request.setPreferredBackupTime("00:00Z-01:00Z");
			Response response = client.modifyBackupPolicy(request);
			System.out.println("testModifyBackupPolicy :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeResourceUsage() {
		try {
			DescribeResourceUsageRequest request = new DescribeResourceUsageRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeResourceUsage(request);
			System.out.println("testDescribeResourceUsage :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeDBInstancePerformance() {
		try {
			DescribeDBInstancePerformanceRequest request = new DescribeDBInstancePerformanceRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			request.setKey(Performance.MYSQL_SESSIONS);
			Response response = client.describeDBInstancePerformance(request);
			System.out.println("testDescribeDBInstancePerformance :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeErrorLogs() {
		try {
			DescribeErrorLogsRequest request = new DescribeErrorLogsRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			Response response = client.describeErrorLogs(request);
			System.out.println("testDescribeErrorLogs :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeBinlogFiles() {
		try {
			DescribeBinlogFilesRequest request = new DescribeBinlogFilesRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			Response response = client.describeBinlogFiles(request);
			System.out.println("testDescribeBinlogFiles :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeSQLLogRecords() {
		try {
			DescribeSQLLogRecordsRequest request = new DescribeSQLLogRecordsRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			request.setQueryKeywords("test");
			Response response = client.describeSQLLogRecords(request);
			System.out.println("testDescribeSQLLogRecords :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeSQLLogReports() {
		try {
			DescribeSQLLogReportsRequest request = new DescribeSQLLogReportsRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			Response response = client.describeSQLLogReports(request);
			System.out.println("testDescribeSQLLogReports :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeSlowLogs() {
		try {
			DescribeSlowLogsRequest request = new DescribeSlowLogsRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			request.setDBName(dbName);
			Response response = client.describeSlowLogs(request);
			System.out.println("testDescribeSlowLogs :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeSlowLogRecords() {
		try {
			DescribeSlowLogRecordsRequest request = new DescribeSlowLogRecordsRequest();
			request.setDBInstanceId(dBInstanceId);
			Date date = new Date();
			String endTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			date = new Date(date.getTime()-36000000);
			String startTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm'Z'").format(date);
			request.setStartTime(startTime);
			request.setEndTime(endTime);
			request.setDBName(dbName);
			Response response = client.describeSlowLogRecords(request);
			System.out.println("testDescribeSlowLogRecords :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeOptimizeAdviceOnStorage() {
		try {
			DescribeOptimizeAdviceOnStorageRequest request = new DescribeOptimizeAdviceOnStorageRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeOptimizeAdviceOnStorage(request);
			System.out.println("testDescribeOptimizeAdviceOnStorage :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeOptimizeAdviceOnBigTable() {
		try {
			DescribeOptimizeAdviceOnBigTableRequest request = new DescribeOptimizeAdviceOnBigTableRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeOptimizeAdviceOnBigTable(request);
			System.out.println("testDescribeOptimizeAdviceOnBigTable :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeOptimizeAdviceOnMissPK() {
		try {
			DescribeOptimizeAdviceOnMissPKRequest request = new DescribeOptimizeAdviceOnMissPKRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeOptimizeAdviceOnMissPK(request);
			System.out.println("testDescribeOptimizeAdviceOnMissPK :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeOptimizeAdviceOnExcessIndex() {
		try {
			DescribeOptimizeAdviceOnExcessIndexRequest request = new DescribeOptimizeAdviceOnExcessIndexRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeOptimizeAdviceOnExcessIndex(request);
			System.out.println("testDescribeOptimizeAdviceOnExcessIndex :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeOptimizeAdviceOnMissIndex() {
		try {
			DescribeOptimizeAdviceOnMissIndexRequest request = new DescribeOptimizeAdviceOnMissIndexRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeOptimizeAdviceOnMissIndex(request);
			System.out.println("testDescribeOptimizeAdviceOnMissIndex :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeParameterTemplates() {
		try {
			DescribeParameterTemplatesRequest request = new DescribeParameterTemplatesRequest();
			request.setEngine(EngineType.MYSQL);
			request.setEngineVersion(EngineVersion.MYSQL_5_5);
			Response response = client.describeParameterTemplates(request);
			System.out.println("testDescribeParameterTemplates :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeParameters() {
		try {
			DescribeParametersRequest request = new DescribeParametersRequest();
			request.setDBInstanceId(dBInstanceId);
			Response response = client.describeParameters(request);
			System.out.println("testDescribeParameters :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModifyParameter() {
		try {
			ModifyParameterRequest request = new ModifyParameterRequest();
			request.setDBInstanceId(dBInstanceId);
			request.setForcerestart(false);
			Map<String, String> map = new HashMap<String, String>();
			map.put("back_log", "20");
			String parameters = new Gson().toJson(map);
			request.setParameters(parameters);
			Response response = client.modifyParameter(request);
			System.out.println("testModifyParameter :: "+new Gson().toJson(response));
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
