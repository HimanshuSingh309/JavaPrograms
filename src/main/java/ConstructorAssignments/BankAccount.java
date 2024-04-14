package ConstructorAssignments;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	
	

		public BankAccount(String accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
	    // This method is used to deposit the amount
		public void deposit(double amount ) {
		if(amount>0) {
		    balance = balance + amount;
		    System.out.println("Deposited amount is: " + amount);
		}
		else {
			System.out.println("You are entering invalid amount: " + amount);		
		}
		    System.out.println("Current balance is: " + balance);
		}
		
		// this getter method is returning the account number
		public String getAccountNumber() {
		return accountNumber;
		}
		
		// This method is used to withdraw the amount
		public void withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance = balance-amount;
			System.out.println("Amount withdraw: " + amount);
		}
		else {
			System.out.println("You have insufficiant balance to withdraw amount. ");
		}
		    System.out.println("Current balance is: " + balance);
		}


		public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("22300001003433498",150000.00);
		b1.deposit(10000);
		b1.withdraw(5000);
		b1.deposit(15000);
		b1.withdraw(8000);
		
		System.out.println("Final Balance for the Account " + b1.getAccountNumber() + " is: " + b1.balance);
		
	}

}
