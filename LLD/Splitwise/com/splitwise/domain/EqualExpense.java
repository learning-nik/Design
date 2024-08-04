package com.splitwise.domain;

public class EqualExpense extends ExpenseCalculatorType {

	@Override
	public void updatePerHeadAmount(Expense expense) {

		System.out.println("Expense is an Equal Expense: " + expense.getDescription());
		int totalMembers = expense.getBorrowers().size() + 1;
		int perHeadAmount = expense.getTotalAmount() / totalMembers;

		System.out.println("Per head amount is" + perHeadAmount);
		expense.getBorrowers().forEach(borrower -> borrower.setPerheadAmount(perHeadAmount));

	}

}
