package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import utils.PriceUpdate;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.0));
		products.add(new Product("Mouse", 50.0));
		products.add(new Product("Tablet", 350.0));
		products.add(new Product("HD Case", 80.0));
		
		products.forEach(new PriceUpdate());
		
		products.forEach(System.out::println);
	}
}