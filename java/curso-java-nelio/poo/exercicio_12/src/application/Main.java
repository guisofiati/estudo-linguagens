package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			System.out.println();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println(account);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}