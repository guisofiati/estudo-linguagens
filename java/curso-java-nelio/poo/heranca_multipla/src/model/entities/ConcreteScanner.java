package model.entities;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(Integer serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		return "Scanned content";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
}