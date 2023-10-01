package com.splitwise.domain;

public class ExpenseEntry {

	private String id;

	private String lender;

	private String borrower;

	private int amount;
	
	private String expenseId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getLender() {
		return lender;
	}

	public void setLender(String lender) {
		this.lender = lender;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}

	@Override
	public String toString() {
		return "ExpenseEntry [id=" + id + ", lender=" + lender + ", borrower=" + borrower + ", amount=" + amount
				+ ", expenseId=" + expenseId + "]";
	}

}
