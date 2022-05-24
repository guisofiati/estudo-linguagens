package entities;

public abstract class TaxPayers {
	
	private String name;
	private Double annualIncome;
	
	public TaxPayers() {
	}

	public TaxPayers(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract double taxToPay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public String toString() {
		return name + ": $ " + String.format("%.2f", taxToPay());
	}
}