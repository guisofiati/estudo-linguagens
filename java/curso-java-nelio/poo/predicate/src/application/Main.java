package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import utils.ProductPredicate;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.0));
		products.add(new Product("Mouse", 50.0));
		products.add(new Product("Tablet", 350.0));
		products.add(new Product("HD Case", 80.0));
		
		// expressao lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		// remove se o argumento for true
		// usando method reference
		products.removeIf(pred);
		
		for (Product p : products) {
			System.out.println(p);
		}
	}
}