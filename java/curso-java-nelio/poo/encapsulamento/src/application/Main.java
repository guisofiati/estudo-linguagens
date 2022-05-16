package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
// 		Erro, pois o atributo e private e nao pode mudar hardcode
//		product.name = "Computador";
		
		product.setName("Computador");
		
//		Erro:
//		System.out.println(product.name);
		
		System.out.println();
		System.out.println("Updated data: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println();
		System.out.println("Updated data: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		sc.close();
	}
}