package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthDate = formater.parse(sc.next());
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
		System.out.println();
		
		Order order = new Order(new Date(), orderStatus, new Client(clientName, clientEmail, clientBirthDate));
		
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			System.out.println();
			
			OrdemItem item = new OrdemItem(quantity, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println(order);
		
		sc.close();
	}
}