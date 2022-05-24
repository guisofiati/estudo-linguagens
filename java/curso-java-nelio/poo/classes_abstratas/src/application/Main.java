package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new SavingsAccount(1000, "Maria", 1000.0, 0.01));
		accounts.add(new BusinessAccount(1001, "Joao", 6990.0, 500.0));
		accounts.add(new SavingsAccount(1002, "Pedro", 2300.0, 0.05));
		accounts.add(new BusinessAccount(1003, "Jose", 8400.0, 700.0));
		
		double sum = 0.0;
		for (Account acc : accounts) {
			sum += acc.getBalance();
		}
		
		System.out.println("Total balance all accounts: " + String.format("%.2f", sum));
		
		for (Account acc : accounts) {
			acc.deposit(10.0);
		}
		
		for (Account acc : accounts) {
			System.out.println("Balance updated: " + acc.getNumber() + ", " 
					+ String.format("%.2f", acc.getBalance()));
		}
	}
}