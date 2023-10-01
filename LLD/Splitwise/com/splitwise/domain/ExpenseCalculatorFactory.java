package com.splitwise.domain;

public class ExpenseCalculatorFactory {

	public static ExpenseCalculatorType getExpense(ExpenseType expenseType) {

		if (ExpenseType.EQUAL.equals(expenseType)) {

			return new EqualExpense();

		} else if (ExpenseType.PERCENTAGE.equals(expenseType)) {

			return new PercentageExpense();

		} else {

		}
		return null;

	}

}
