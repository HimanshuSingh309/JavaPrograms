package encapsulationExamples;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
		balance = balance + amount;
		System.out.println("Deposited amount is: " + amount);
		}
		else {
			System.out.println("Invalid amount." + amount);
			}
		System.out.println("Current balance is: " + balance);
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance - amount;
			System.out.println("Amount withdraw: " + amount);			
			
		}
		else {
			System.out.println("Insufficiant funds.");
		}
		System.out.println("Current balance is: " + balance);
	}
	public void printStatement() {
		System.out.println("Account Holder Name: " + owner);
		System.out.println("Account Number: " + accountNumber );
		System.out.println("Current Balance: " + balance);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setBalance(250000);
		b1.setAccountNumber("2230000100234506");
		b1.setOwner("Himanshu Singh");
		b1.deposit(15000);
		b1.withdraw(25000);
		b1.deposit(45000);
		b1.withdraw(4560);
		b1.printStatement();

	}

}
