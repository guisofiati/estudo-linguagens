package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Map<Product, Integer> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Celular", 1500.0);
		Product p3 = new Product("Fogao", 1200.0);
		
		stock.put(p1, 43);
		stock.put(p2, 21);
		stock.put(p3, 34);
		
		Product product = new Product("Tv", 900.0);
		
		System.out.println("ALL PRODUCTS:");
		for (Product p : stock.keySet()) {
			System.out.println(p + ", " + "quantity in stock: " + stock.get(p));
		}
		
		System.out.println();
		System.out.println("Contains 'product' key: " + stock.containsKey(product));
	}
}