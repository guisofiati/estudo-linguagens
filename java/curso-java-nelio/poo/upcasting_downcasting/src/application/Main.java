package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1000, "Maria", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1001, "Jose", 5000.0, 1000.0);
		
		// UPCASTING -> Casting de uma subclasse para a superclasse
		// Pegar um objeto da subclasse e atribui-lo para uma varivel da superclasse
		
		Account acc1 = bacc;
		
		// Uma conta de negocio e uma conta
		Account acc2 = new BusinessAccount(1002, "Ricardo", 4500.0, 2000.0);
		
		// Uma conta poupanca e uma conta
		Account acc3 = new SavingsAccount(1003, "Jessica", 0.0, 100.0);
		
		// DOWNCASTING -> Casting de uma superclasse para uma subclasse
		// Pegar um objeto da superclasse e atribui-lo para uma variavel da subclasse
		
		
		// O tipo do acc2 e Account
		// BusinessAccount acc4 = acc2;
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(500.0);

//		BusinessAccount acc5 = acc3;
//		BusinessAccount acc5 = (BusinessAccount) acc3; - So da erro quando executado
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(700.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
	}
}