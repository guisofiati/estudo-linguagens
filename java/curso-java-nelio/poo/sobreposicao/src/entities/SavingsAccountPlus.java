package entities;

public class SavingsAccountPlus extends SavingsAccount {

	private Double bonus;
	
	public SavingsAccountPlus() {
		super();
	}

	public SavingsAccountPlus(Integer number, String holder, Double balance, Double interestRate, Double bonus) {
		super(number, holder, balance, interestRate);
		this.bonus = bonus;
	}
	
// Metodo da superclasse e final, entao nao pode ser sobreposto aqui	
//	@Override
//	public void withdraw(double amount) {
//		super.withdraw(amount);
//		balance -= 2.0;
//	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}