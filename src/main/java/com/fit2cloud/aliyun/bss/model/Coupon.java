package com.fit2cloud.aliyun.bss.model;

import java.util.Date;

public class Coupon {
	
	private String Description;
	private String CouponNumber;
	private Date CreationTime;
	private Date ExpiredTime;
	private String Status;
	private double BalanceAmount;
	private double TotalAmount;
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCouponNumber() {
		return CouponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		CouponNumber = couponNumber;
	}
	public Date getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(Date creationTime) {
		CreationTime = creationTime;
	}
	public Date getExpiredTime() {
		return ExpiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		ExpiredTime = expiredTime;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getBalanceAmount() {
		return BalanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		BalanceAmount = balanceAmount;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Coupon [Description=" + Description + ", CouponNumber="
				+ CouponNumber + ", CreationTime=" + CreationTime
				+ ", ExpiredTime=" + ExpiredTime + ", Status=" + Status
				+ ", BalanceAmount=" + BalanceAmount + ", TotalAmount="
				+ TotalAmount + "]";
	}
	
}
