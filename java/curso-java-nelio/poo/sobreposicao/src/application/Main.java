package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account acc1 = new Account(1000, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println("Account balance = " + acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1001, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Savings account balance = " + acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1002, "Jose", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println("Business account balance = " + acc3.getBalance());
	}
}