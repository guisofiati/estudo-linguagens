package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\funcionarios.csv";
		
		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String emp = br.readLine();
			while (emp != null) {
				String[] field = emp.split(",");
				String name = field[0];
				String email = field[1];
				Double salary = Double.parseDouble(field[2]);
				employees.add(new Employee(name, email, salary));
				emp = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.compareToIgnoreCase(s2);
			
			System.out.println("Email of people whose salary is more than " + salary);
			List<String> emails = employees.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
				
			
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.print("Sum of salary of people whose name start with 'M': " + String.format("%.2f", sum));
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}