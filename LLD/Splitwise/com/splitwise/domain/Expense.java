package com.splitwise.domain;

import java.util.List;

public class Expense {

	private String id;

	private int totalAmount;

	private long timestamp;

	private String description;

	private List<UserExpenseMapping> borrowers;

	private String lender;

	private ExpenseType expenseType;

	// private User creator;

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserExpenseMapping> getBorrowers() {
		return borrowers;
	}

	public void setBorrowers(List<UserExpenseMapping> borrowers) {
		this.borrowers = borrowers;
	}

	public String getLender() {
		return lender;
	}

	public void setLender(String lender) {
		this.lender = lender;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", totalAmount=" + totalAmount + ", timestamp=" + timestamp + ", description="
				+ description + ", borrowers=" + borrowers + ", lender=" + lender + ", expenseType=" + expenseType
				+ "]";
	}

}
