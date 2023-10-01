package com.splitwise.domain;

public class UserExpenseMapping {

	private String userId;

	private int perheadAmount;

	private int percentage;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPerheadAmount() {
		return perheadAmount;
	}

	public void setPerheadAmount(int perheadAmount) {
		this.perheadAmount = perheadAmount;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
