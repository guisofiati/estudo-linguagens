package entities;

// Garantindo heranca total
public abstract class Account {
	
	private static final double TAX_WITHDRAW = 5.0;
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX_WITHDRAW;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
}