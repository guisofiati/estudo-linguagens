package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 700.0));
		
		list.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}