package com.splitwise.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.splitwise.domain.Expense;
import com.splitwise.domain.ExpenseCalculatorType;
import com.splitwise.domain.ExpenseCalculatorFactory;
import com.splitwise.domain.ExpenseEntry;
import com.splitwise.domain.User;
import com.splitwise.domain.UserExpenseMapping;

public class SplitwiseService {

	private List<User> users = new ArrayList<>();

	private List<Expense> expenses = new ArrayList<>();

	private Map<String, ExpenseEntry> expensesMap = new HashMap<>();

	public void registerUser(User user) {
		users.add(user);

	}

	public void addExpense(Expense expense) {

		expenses.add(expense);

		// add in expense entry

		updatePerHeadAmount(expense);

		buildExpenseEntry(expense.getBorrowers(), expense.getLender(), expense.getId());

	}

	private void updatePerHeadAmount(Expense expense) {

		final ExpenseCalculatorType expenseAmountType = ExpenseCalculatorFactory.getExpense(expense.getExpenseType());
		expenseAmountType.updatePerHeadAmount(expense);

	}

	private void buildExpenseEntry(List<UserExpenseMapping> borrowers, String lender, String expenseId) {

		for (UserExpenseMapping borrower : borrowers) {

			final ExpenseEntry entry = getExpenseEntry(lender, expenseId, borrower);

			final int perHeadAmount = entry.getAmount();
			// For each entry , check if it exists already in the map for the same set of
			// borrower and lender.
			// If Yes , update the entry otherwise add the entry in the map.
			if (expensesMap.containsKey(lender + "#" + borrower.getUserId())
					|| expensesMap.containsKey(borrower.getUserId() + "#" + lender)) {
				ExpenseEntry oldEntry;
				String id = lender + "#" + borrower.getUserId();
				if (expensesMap.get(id) != null) {
					oldEntry = expensesMap.get(id);
				} else {
					id = borrower.getUserId() + "#" + lender;
					oldEntry = expensesMap.get(id);

				}

				System.out.println("Entry Matched::" + lender + borrower.getUserId());
				if (oldEntry.getLender().equals(lender)) {
					System.out.println("Lenders Matched");
					entry.setAmount(perHeadAmount + oldEntry.getAmount());
				} else {
					if (oldEntry.getAmount() - perHeadAmount > 0) {
						System.out.println("Lender has to be changed");
						entry.setAmount(oldEntry.getAmount() - perHeadAmount);
						entry.setBorrower(lender);
						entry.setLender(borrower.getUserId());
					} else {
						System.out.println("Lender has not to be changed");
						entry.setAmount(perHeadAmount - oldEntry.getAmount());
					}
				}

				System.out.println("Entry is::::" + entry);
				expensesMap.put(id, entry);

			} else {
				System.out.println("This is a first time entry ");
				System.out.println(lender + "#" + borrower.getUserId());
				System.out.println("Entry is::::" + entry);
				expensesMap.put(lender + "#" + borrower.getUserId(), entry);
			}
		}

		System.out.println("--------------Entry Completed----------");

	}

	private ExpenseEntry getExpenseEntry(String lender, String expenseId, UserExpenseMapping borrower) {
		System.out.println(borrower + ":borrower");

		ExpenseEntry entry = new ExpenseEntry();
		entry.setExpenseId(expenseId);
		entry.setId(lender + "#" + borrower.getUserId());
		entry.setBorrower(borrower.getUserId());
		entry.setAmount(borrower.getPerheadAmount());
		entry.setLender(lender);
		return entry;
	}

	public void getStatusOfAllUsers() {

		System.out.println("-------------------------------------------------");
		System.out.println("Final Status is");

		/*
		 * for (Map.Entry<String, ExpenseEntry> entry : expensesMap.entrySet()) {
		 * System.out.println(entry.getValue().getLender() + " getsBack " +
		 * entry.getValue().getAmount() + "Rs from " + entry.getValue().getBorrower());
		 * }
		 */

		expensesMap.forEach((key, value) -> {
			System.out.println(value.getLender() + " getsBack " + value.getAmount() + "Rs from " + value.getBorrower());
		});

	}

}
