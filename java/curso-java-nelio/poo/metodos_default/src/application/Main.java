package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService interestService = new BrazilInterestService(2.0);
		double payment = interestService.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}