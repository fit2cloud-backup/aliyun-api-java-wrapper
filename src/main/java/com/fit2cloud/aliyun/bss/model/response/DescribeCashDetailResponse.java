package com.fit2cloud.aliyun.bss.model.response;


public class DescribeCashDetailResponse {
	private double BalanceAmount;

	public double getBalanceAmount() {
		return BalanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		BalanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "DescribeCashDetailResponse [BalanceAmount=" + BalanceAmount
				+ "]";
	}
	
	
}
