package entities;

public final class CompanyPerson extends TaxPayers {
	
	private Integer numberOfEmployees;
	
	public CompanyPerson() {
		super();
	}

	public CompanyPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxToPay() {
		
		double totalToPay = 0.0;
		
		if (numberOfEmployees > 10) {
			totalToPay = getAnnualIncome() * 14.0 / 100.0;
		}
		else {
			totalToPay = getAnnualIncome() * 16.0 / 100.0;
		}
		
		return totalToPay;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}