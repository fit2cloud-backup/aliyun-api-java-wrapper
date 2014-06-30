# 阿里云 API Java封装库 使用指南

## 第一步：引用Jar包

### 方法1：使用Maven

```xml

<!-- repository -->
<repositories>
	<repository>
		<id>fit2cloud</id>
		<url>http://repository.fit2cloud.com/content/groups/public/</url>
		<releases>
			<enabled>true</enabled>
		</releases>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>  
</repositories>

<!-- dependency -->
<dependency>
  <groupId>com.fit2cloud</groupId>
  <artifactId>aliyun-api-java-wrapper</artifactId>
  <version>1.0</version>
</dependency>
```

### 方法2：直接下载Jar包

下载地址是：
http://repository.fit2cloud.com/service/local/repo_groups/public/content/com/fit2cloud/aliyun-api-java-wrapper/1.0/aliyun-api-java-wrapper-1.0-jar-with-dependencies.jar

## 第二步：调用Aliyun ECS API

```java
		String apiKey = "你的consumer key";
		String apiSecret = "你的secret key";
		Fit2CloudClient client = new Fit2CloudClient(apiKey, apiSecret);
		System.out.println("List clusters.....");
		System.out.println(client.getClusters());
 		String ACCESS_KEY_ID = "你的阿里云API Access key";
    	String ACCESS_KEY_SECRET = "你的阿里云API Secret key";
        ECSClient client = new ECSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
        ListRegionsResponse response = client.listRegions();		
```
目前仅封装了ECS相关API，包括

1. listRegions: 获取数据中心列表
2. listZones: 获取Zone列表
3. listImages: 获取镜像列表
4. listSecurityGroups: 获取安全组列表
5. createSecurityGroup: 创建安全组
6. authorizeSecurityGroup: 为完全组添加规则
7. revokeSecurityGroup: 取消规则
8. listSecurityPermissions: 列出安全组的规则
9. deleteSecurityGroup: 删除安全组
10. joinSecurityGroup: 将虚机加入安全组
11. listInstanceType: 列出虚机类型
12. createInstance: 创建虚机
13. getInstance: 获取虚机详细信息
14. listInstances: 获取虚机列表
15. startInstance: 启动虚机
16. allocatePublicIp: 为虚机分配公有IP
17. rebootInstance: 重启虚机
18. stopInstance: 停止虚机
19. deleteInstance: 删除虚机
20. addDisk: 为虚机增加数据盘
21. listDisks: 列出虚机的磁盘列表

异常处理，每个API调用都会有两类异常：

1. AliyunClientException: 客戶端錯誤，比如网络问题
2. AliyunServiceException: 服务器端错误，阿里云会返回错误代码和具体消息
