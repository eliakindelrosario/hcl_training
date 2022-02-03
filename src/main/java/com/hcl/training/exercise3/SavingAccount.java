package com.hcl.training.exercise3;

public class SavingAccount {
	private int customerID;
	private String customerName;
	private float balance = 0;
	
	public SavingAccount(int id, String name) {
		this.customerID = id;
	    this.customerName = name;
	}
	
	// Getters
    public int getCustomerID() { return this.customerID; }
    public String getStudentName() { return this.customerName; }
    public float getBalance() {return this.balance; }
  
    // Setters
    public void setCustomertName(String name){
        this.customerName = name;
    }
    
    public void deposit(float amount){
        this.balance += amount;
    }
    
    // Specific Features
    public float withdraw(float amount) throws InSufficientBalance {
    	if (amount <= this.balance) {
    		this.balance -= amount;
    		return amount;
    	}else {
    		throw new InSufficientBalance("You don't have sufficient funds to perform this transaction.");
    	}
    }

}
