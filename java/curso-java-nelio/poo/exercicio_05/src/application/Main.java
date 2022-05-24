package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
			
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			acc = new Account(account, holder, value);
		}
		else {
			acc = new Account(account, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(acc);

		sc.close();
	}
}