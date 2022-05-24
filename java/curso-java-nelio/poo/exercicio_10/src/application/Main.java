package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			
			while (answer != 'c' && answer != 'u' && answer != 'i') {
				System.out.print("Invalid code. Enter with c (common), u (used) or i (imported): ");
				answer = sc.next().charAt(0);
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (answer == 'c') {
				products.add(new Product(name, price));
			}
			else if (answer == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = formater.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			else if (answer == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}