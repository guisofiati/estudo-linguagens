package entities;

public class BusinessAccount extends Account {
	
	private static final double TAX_LOAN = 10.0;
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			// Para poder acessar o balance, o modificador de acesso deve ser protected
			balance += amount - TAX_LOAN;
		}
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
}