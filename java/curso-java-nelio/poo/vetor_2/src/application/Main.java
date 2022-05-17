package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Product[] vet = new Product[N];
		
		for (int i=0; i<vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vet.length; i++) {
			sum += vet[i].getPrice();
		}
		
		double average = sum / vet.length;
		
		System.out.printf("AVERAGE PRICE = %.2f\n", average);
		
		sc.close();
	}
}