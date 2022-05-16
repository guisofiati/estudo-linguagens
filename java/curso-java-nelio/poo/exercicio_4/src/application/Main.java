package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double total = CurrencyConverter.totalToPay(price, amount);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", total));
		
		sc.close();
	}
}