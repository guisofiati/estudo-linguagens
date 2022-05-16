package entities;

public class Account {
	
	private final double TAX = 5.00;
	
	private int account;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX;
	}

	public int getAccount() {
		return account;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account "
				+ account
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}