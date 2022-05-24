package entities;

public final class IndividualPerson extends TaxPayers {
	
	private Double healthExpenditures;
	
	public IndividualPerson() {
		super();
	}

	public IndividualPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxToPay() {
		
		if (getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

	public Double gethealthExpenditures() {
		return healthExpenditures;
	}

	public void sethealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
}