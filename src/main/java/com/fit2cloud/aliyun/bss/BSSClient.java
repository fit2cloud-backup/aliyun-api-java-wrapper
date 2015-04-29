package com.fit2cloud.aliyun.bss;

import java.util.Map;

import com.fit2cloud.aliyun.AliyunClientException;
import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.AliyunServiceException;
import com.fit2cloud.aliyun.PageableRequest;
import com.fit2cloud.aliyun.bss.model.request.DescribeCashDetailRequest;
import com.fit2cloud.aliyun.bss.model.request.DescribeCouponListRequest;
import com.fit2cloud.aliyun.bss.model.response.DescribeCashDetailResponse;
import com.fit2cloud.aliyun.bss.model.response.DescribeCouponListResponse;
import com.fit2cloud.aliyun.bss.model.response.PageableResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class BSSClient 
{
    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    private BSSRequest request;

    public BSSClient(AliyunCredentials credentials){
    	request = new BSSRequest(credentials);
    }
    
    public DescribeCashDetailResponse describeCashDetail(final DescribeCashDetailRequest describeCashDetailRequest) throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return gson.fromJson(request.execute("DescribeCashDetail", describeCashDetailRequest.toMap()), DescribeCashDetailResponse.class);
    }

    public DescribeCouponListResponse describeCouponList(
    		final DescribeCouponListRequest describeCouponListRequest) 
    				throws JsonSyntaxException, AliyunClientException, AliyunServiceException {
    	return (DescribeCouponListResponse) listPageableData(describeCouponListRequest, "DescribeCouponList", DescribeCouponListResponse.class);
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
