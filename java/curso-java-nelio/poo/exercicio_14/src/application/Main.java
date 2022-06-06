package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int numberOfContract = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		Date dateOfContract = formater.parse(sc.next());
		System.out.print("Contract value: ");
		double amountOfContract = sc.nextDouble();
		
		Contract contract = new Contract(numberOfContract, dateOfContract, amountOfContract);
		
		System.out.print("Enter number of installments: ");
		int numberOfInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numberOfInstallments);
		
		System.out.println();
		System.out.println("INSTALLMENTS");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}