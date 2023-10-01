package com.splitwise.controller;

import java.util.List;
import java.util.UUID;

import com.splitwise.domain.Expense;
import com.splitwise.domain.ExpenseType;
import com.splitwise.domain.User;
import com.splitwise.domain.UserExpenseMapping;

public class SplitwiseController {

	private SplitwiseService splitwiseService = new SplitwiseService();

	public void registerUser(String emailId, String name) {
		User user = new User(emailId, name);
		splitwiseService.registerUser(user);

	}

	public void addExpense(List<UserExpenseMapping> borrowers, String lender, String description, int totalAmount,
			ExpenseType expenseType) {

		final Expense expense = new Expense();
		expense.setDescription(description);
		expense.setBorrowers(borrowers);
		expense.setLender(lender);
		expense.setTotalAmount(totalAmount);
		expense.setExpenseType(expenseType);
		final String expenseId = UUID.randomUUID().toString();
		expense.setId(expenseId);
		expense.setTimestamp(System.currentTimeMillis());

		splitwiseService.addExpense(expense);
	}

	public void getFinalAllUsersStatus() {
		splitwiseService.getStatusOfAllUsers();
	}

}
