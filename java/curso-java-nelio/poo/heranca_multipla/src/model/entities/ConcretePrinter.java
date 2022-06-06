package model.entities;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(Integer serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printing: " + doc);
	}
}