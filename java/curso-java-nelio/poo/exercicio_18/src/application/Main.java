package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.ProductService;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.0));
		products.add(new Product("Mouse", 50.0));
		products.add(new Product("Tablet", 350.0));
		products.add(new Product("HD Case", 80.0));
		
		ProductService ps = new ProductService();
		
		double totalFiltered = ps.filteredSum(products, p -> p.getName().charAt(0) == 'T');
		
		System.out.println(totalFiltered);
	}
}