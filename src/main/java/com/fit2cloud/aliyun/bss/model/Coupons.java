package com.fit2cloud.aliyun.bss.model;

import java.util.ArrayList;
import java.util.List;

import com.fit2cloud.aliyun.bss.model.Coupon;

public class Coupons {
	private List<Coupon> Coupon = new ArrayList<Coupon>();

	public List<Coupon> getCoupon() {
		return Coupon;
	}
	
	public void setCoupon(List<Coupon> coupon) {
		this.Coupon = coupon;
	}
	
	public List<Coupon> getList(){
		return Coupon;
	}

	@Override
	public String toString() {
		return "Coupons [Coupon=" + Coupon + "]";
	}

}
