package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.CalculationService;

public class Main {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\items.txt";
		
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}