package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Main {

	public static void main(String[] args) {
		
		ConcretePrinter cp = new ConcretePrinter(1000);
		cp.print("Carta");
		cp.processDoc("Carta");
		
		System.out.println();
		
		ConcreteScanner cs = new ConcreteScanner(1001);
		System.out.println("Scan result: " + cs.scan());
		cs.processDoc("Email");
		
		System.out.println();
		
		ComboDevice cd = new ComboDevice(1002);
		cd.print("Combo");
		System.out.println("Scan result: " + cd.scan());
		cd.processDoc("Combo");
	}
}