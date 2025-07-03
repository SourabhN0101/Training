package com.oops;

public class BankAccount {
	    int accountNumber;
	    String holderName;
	    double balance;

	    // Constructor to initialize account details
	    public BankAccount(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount!");
	        }
	    }

	    // Method to display account details
	    public void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Holder Name: " + holderName);
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("---------------------------");
	    }

	    // Main method to test BankAccount
	    public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount(23441, "Sourabh Navale", 12000.00);

	        acc1.displayAccount();

	        acc1.deposit(1500.00);
	        acc1.withdraw(2000.00);

	        acc1.displayAccount();
	    }

}
