package com.splitwise.domain;

public class ExpenseCalculatorFactory {

	private ExpenseCalculatorFactory() {

	}

	public static ExpenseCalculatorType getExpense(ExpenseType expenseType) {

		if (ExpenseType.EQUAL.equals(expenseType)) {

			return new EqualExpense();

		} else if (ExpenseType.PERCENTAGE.equals(expenseType)) {

			return new PercentageExpense();

		} else if (ExpenseType.EXACT.equals(expenseType)) {
			return new ExactExpense();

		}
		return null;

	}

}
