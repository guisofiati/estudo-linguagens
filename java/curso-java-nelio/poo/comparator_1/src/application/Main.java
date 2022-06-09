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
		
		//classe anonima (n precisa criar uma classe separada, implementando etc..)
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
		};
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}