package com.splitwise.controller;

import java.util.ArrayList;
import java.util.List;

import com.splitwise.domain.ExpenseType;
import com.splitwise.domain.UserExpenseMapping;

public class TestSplitwise {

	private static SplitwiseController controller = new SplitwiseController();

	public static void main(String[] args) {
		// 1. Register User 
		// 2. Create group 
		// 3. Add users to group 
		// 4 .Add an expense and share with among the members of group.
		//    Expense: Could either be EQUAL, EXACT or PERCENT
		// 5. Expense type can be created , pending and settled.
		// 6. Send notification to users on their share to be paid.
		// 7 .Expense creator should be able to track their expenses and payments made by users.
		// 8 .Users can settle expense in parts.
		// 9. Once the settlement is complete from all the users the expense should become "Settled".

		System.out.println("SPLITWISE STARTED");

		//useCase1();

		//	useCase2();
		
		//useCaseWithPercentage();
		
		useCaseWithExact();

		controller.getFinalAllUsersStatus();

	}

	/*private static void useCase2() {
		controller.registerUser("nikhil@ivanti.com", "Nikhil");
		controller.registerUser("komal@ivanti.com", "Rishi");
	
		List<String> borrowers = new ArrayList<>();
		borrowers.add("komal@ivanti.com");
	
		controller.addExpense(borrowers, "nikhil@ivanti.com", "Movie", 1000);
	
		List<String> borrowers1 = new ArrayList<>();
		borrowers1.add("nikhil@ivanti.com");
	
		controller.addExpense(borrowers1, "komal@ivanti.com", "Dinner", 1200);
	
		List<String> borrowers2 = new ArrayList<>();
		borrowers2.add("nikhil@ivanti.com");
	
		controller.addExpense(borrowers2, "komal@ivanti.com", "Switch", 200);
	}*/

	private static void useCaseWithExact() {

		controller.registerUser("nikhil@ivanti.com", "Nikhil");
		controller.registerUser("rishi@ivanti.com", "Rishi");
		controller.registerUser("poddar@ivanti.com", "Poddar");

		// Expense 1
		
		List<UserExpenseMapping> borrowers = new ArrayList<>();
		
		UserExpenseMapping borrower1 = new UserExpenseMapping();
		borrower1.setUserId("rishi@ivanti.com");
		borrower1.setPerheadAmount(45);
		
		
		UserExpenseMapping borrower2 = new UserExpenseMapping();
		borrower2.setUserId("poddar@ivanti.com");
		borrower2.setPerheadAmount(40);
		
		borrowers.add(borrower1);
		borrowers.add(borrower2);
		
		controller.addExpense(borrowers, "nikhil@ivanti.com", "Movie", 100, ExpenseType.EXACT);
		
		// ---------------------------------------------------------------------------------
		// ---------------------------Expense 2---------------------------
		
//		nikhil@ivanti.com getsBack 40Rs from poddar@ivanti.com
//		nikhil@ivanti.com getsBack 45Rs from rishi@ivanti.com

		List<UserExpenseMapping> borrowers3 = new ArrayList<>();
		
		UserExpenseMapping borrower3 = new UserExpenseMapping();
		borrower1.setUserId("nikhil@ivanti.com");
		borrower1.setPerheadAmount(60);
		
		
		UserExpenseMapping borrower4 = new UserExpenseMapping();
		borrower2.setUserId("poddar@ivanti.com");
		borrower2.setPerheadAmount(25);
		
		borrowers3.add(borrower3);
		borrowers3.add(borrower4);
		
		controller.addExpense(borrowers, "rishi@ivanti.com", "Movie", 100, ExpenseType.EXACT);
	}

	private static void useCase1() {
		controller.registerUser("nikhil@ivanti.com", "Nikhil");
		controller.registerUser("rishi@ivanti.com", "Rishi");
		controller.registerUser("poddar@ivanti.com", "Poddar");

		List<UserExpenseMapping> borrowers = new ArrayList<>();
		
		UserExpenseMapping borrower1 = new UserExpenseMapping();
		borrower1.setUserId("rishi@ivanti.com");
		UserExpenseMapping borrower2 = new UserExpenseMapping();
		borrower2.setUserId("poddar@ivanti.com");
		
		borrowers.add(borrower1);
		borrowers.add(borrower2);
		
		controller.addExpense(borrowers, "nikhil@ivanti.com", "Movie", 900, ExpenseType.EQUAL);

		List<UserExpenseMapping> borrowers1 = new ArrayList<>();
		
		UserExpenseMapping borrower11 = new UserExpenseMapping();
		borrower11.setUserId("nikhil@ivanti.com");
		UserExpenseMapping borrower12 = new UserExpenseMapping();
		borrower12.setUserId("poddar@ivanti.com");
		
		borrowers1.add(borrower11);
		borrowers1.add(borrower12);
		
		controller.addExpense(borrowers1, "rishi@ivanti.com", "Movie2", 1200, ExpenseType.EQUAL);

		List<UserExpenseMapping> borrowers2 = new ArrayList<>();

		UserExpenseMapping borrower21 = new UserExpenseMapping();
		borrower21.setUserId("nikhil@ivanti.com");

		UserExpenseMapping borrower22 = new UserExpenseMapping();
		borrower22.setUserId("rishi@ivanti.com");

		borrowers2.add(borrower21);
		borrowers2.add(borrower22);

		controller.addExpense(borrowers2, "poddar@ivanti.com", "Movie3", 780, ExpenseType.EQUAL);
		
		//System.out.println("----Expense Entries are--------");
		
		
	}
	
	private static void useCaseWithPercentage() {
		controller.registerUser("nikhil@ivanti.com", "Nikhil");
		controller.registerUser("rishi@ivanti.com", "Rishi");
		controller.registerUser("poddar@ivanti.com", "Poddar");

		// Expense 1
		
		List<UserExpenseMapping> borrowers = new ArrayList<>();
		
		UserExpenseMapping borrower1 = new UserExpenseMapping();
		borrower1.setUserId("rishi@ivanti.com");
		borrower1.setPercentage(45);
		
		
		UserExpenseMapping borrower2 = new UserExpenseMapping();
		borrower2.setUserId("poddar@ivanti.com");
		borrower2.setPercentage(45);
		
		borrowers.add(borrower1);
		borrowers.add(borrower2);
		
		controller.addExpense(borrowers, "nikhil@ivanti.com", "Movie", 100, ExpenseType.PERCENTAGE);
		
		// ---------------------------------------------------------------------------------
		// ---------------------------Expense 2---------------------------
		
//		nikhil@ivanti.com getsBack 45Rs from poddar@ivanti.com
//		nikhil@ivanti.com getsBack 10Rs from rishi@ivanti.com

		List<UserExpenseMapping> borrowers3 = new ArrayList<>();
		
		UserExpenseMapping borrower3 = new UserExpenseMapping();
		borrower1.setUserId("nikhil@ivanti.com");
		borrower1.setPercentage(60);
		
		
		UserExpenseMapping borrower4 = new UserExpenseMapping();
		borrower2.setUserId("poddar@ivanti.com");
		borrower2.setPercentage(25);
		
		borrowers3.add(borrower3);
		borrowers3.add(borrower4);
		
		controller.addExpense(borrowers, "rishi@ivanti.com", "Movie", 100, ExpenseType.PERCENTAGE);

		
		
	}

}
