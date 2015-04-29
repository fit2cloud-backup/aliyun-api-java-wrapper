package com.fit2cloud.aliyun;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.aliyun.bss.BSSClient;
import com.fit2cloud.aliyun.bss.model.request.DescribeCashDetailRequest;
import com.fit2cloud.aliyun.bss.model.request.DescribeCouponListRequest;
import com.fit2cloud.aliyun.bss.model.response.DescribeCashDetailResponse;
import com.fit2cloud.aliyun.bss.model.response.DescribeCouponListResponse;

public class AliyunBSSClientTest {

	private BSSClient client;

	@Before
	public void setUp() throws Exception {
    	String ACCESS_KEY_ID = "";
    	String ACCESS_KEY_SECRET = "";
    	client = new BSSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	}
	
	@Test
	public void testDescribeCachDetail() {
		try {
			DescribeCashDetailRequest request = new DescribeCashDetailRequest();
			DescribeCashDetailResponse response = client.describeCashDetail(request);
			System.out.println("testDescribeCachDetail :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDescribeCouponList() {
		try {
			DescribeCouponListRequest request = new DescribeCouponListRequest();
			DescribeCouponListResponse response = client.describeCouponList(request);
			System.out.println("testDescribeCouponList :: "+response);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
}

