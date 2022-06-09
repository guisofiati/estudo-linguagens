package application;

import java.util.ArrayList;
import java.util.List;

import entities.MyComparator;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 700.0));
		
		list.sort(new MyComparator());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}