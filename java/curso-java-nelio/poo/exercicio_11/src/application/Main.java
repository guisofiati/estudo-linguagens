package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.TaxPayers;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayers> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			
			while (answer != 'i' && answer != 'c') {
				System.out.print("Invalid code. Enter with i (individual) or c (company): ");
				answer = sc.next().charAt(0);
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				taxPayers.add(new IndividualPerson(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxPayers.add(new CompanyPerson(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayers taxPayer : taxPayers) {
			System.out.println(taxPayer);
		}
		
		double sum = 0.0;
		for (TaxPayers taxPayer : taxPayers) {
			sum += taxPayer.taxToPay();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));

		sc.close();
	}
}