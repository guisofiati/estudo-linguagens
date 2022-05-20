package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		
		System.out.println();
		System.out.print("How many contracts to this worker? ");
		int numberContracts = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=numberContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (dd/mm/yyyy): ");
			sc.nextLine();
			Date date = formater.parse(sc.nextLine());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			System.out.println();
			
			worker.addContract(new HourContract(date, valuePerHour, duration));
		}
		
		System.out.print("Enter month and year to calculate income (mm/yyyy): ");
		sc.nextLine();
		String monthAndYear = sc.nextLine();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		double income = worker.income(month, year);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", income));
		
		sc.close();
	}
}