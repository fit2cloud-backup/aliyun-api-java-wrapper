package com.fit2cloud.aliyun.bss.model.response;

import com.fit2cloud.aliyun.bss.model.Coupons;

public class DescribeCouponListResponse extends PageableResponse  {
	
	
	private Coupons Coupons = new Coupons();

	public void setCoupons(Coupons coupons) {
		Coupons = coupons;
	}

	public DescribeCouponListResponse() {
		Coupons = new Coupons();
	}

	public Coupons getCoupons() {
		return Coupons;
	}

	public void add(PageableResponse response) {
		super.add(response);
		this.getCoupons().getCoupon().addAll(((DescribeCouponListResponse) response).getCoupons().getCoupon());
	}

	@Override
	public String toString() {
		return "DescribeCouponListResponse [Coupons=" + Coupons + "]";
	}
}
