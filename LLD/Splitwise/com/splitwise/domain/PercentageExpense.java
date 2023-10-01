package com.splitwise.domain;

public class PercentageExpense extends ExpenseCalculatorType {

	@Override
	public void updatePerHeadAmount(Expense expense) {

		expense.getBorrowers().forEach(borrower -> {

			int percentShare = borrower.getPercentage();
			borrower.setPerheadAmount((percentShare * expense.getTotalAmount()) / 100);
		});
	}

}
