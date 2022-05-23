package application;

import java.util.Locale;

import entities.BusinessAccount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BusinessAccount bc = new BusinessAccount(1000, "Maria", 1000.0, 100.0);
		
		System.out.println(bc.getNumber());
		System.out.println(bc.getHolder());
		System.out.println(bc.getBalance());
	}
}