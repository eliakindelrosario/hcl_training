package com.hcl.training.exercise3;

public class BankDriver {

	public static void main(String[] args) {
		SavingAccount test_customer = new SavingAccount(1, "John Doe");
		
		// Set test data
		test_customer.deposit(600);
		try {
			float amount = test_customer.withdraw(500);
			System.out.println("You successfully withdrew $"+ amount +".");
		}
		catch(InSufficientBalance e) {
			System.out.println(e);
		}
		
		//	Execption Condition
		try {
			float amount = test_customer.withdraw(200);
			System.out.println("You successfully withdrew $"+ amount +".");
		}
		catch(InSufficientBalance e) {
			System.out.println(e);
		}
			
		
	}

}
