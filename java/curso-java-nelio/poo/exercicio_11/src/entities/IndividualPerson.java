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
		
		double totalToPay = 0.0;
		
		if (getAnnualIncome() < 20000.00) {
			totalToPay = getAnnualIncome() * 15.0 / 100.0;
		}
		else {
			totalToPay = getAnnualIncome() * 25.0 / 100.0;
		}
		
		if (healthExpenditures > 0) {
			totalToPay -= healthExpenditures * 50.0 / 100.0;
		}
		
		return totalToPay;
	}

	public Double gethealthExpenditures() {
		return healthExpenditures;
	}

	public void sethealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
}