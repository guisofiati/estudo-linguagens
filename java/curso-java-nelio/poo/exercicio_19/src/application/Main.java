package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\produtos.csv";
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				products.add(new Product(name, price));
				line = br.readLine();
			}
			
			double avg = products.stream()
					// como a lista e do tipo Product, precisa pegar apenas o atrib. price
					.map(x -> x.getPrice())
					.reduce(0.0, (x, y) -> x + y) / products.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.compareToIgnoreCase(s2);
			
			List<String> names = products.stream()
					.filter(x -> x.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}