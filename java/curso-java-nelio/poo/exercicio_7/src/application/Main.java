package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(employees, id)) {
				System.out.print("Id already exists. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exists!");
		}
		else {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}
				
		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : employees) {
			System.out.println(x);
		}
		
		sc.close();
	}

	private static boolean hasId(List<Employee> employees, int id) {
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}