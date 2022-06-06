package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\employees.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeesCSV = br.readLine();
			while (employeesCSV != null) {
				String[] emp = employeesCSV.split(",");
				list.add(new Employee(emp[0], Double.parseDouble(emp[1])));
				employeesCSV = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + " - " + emp.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}