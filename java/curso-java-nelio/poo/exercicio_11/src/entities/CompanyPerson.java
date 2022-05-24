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
		
		if (numberOfEmployees > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}