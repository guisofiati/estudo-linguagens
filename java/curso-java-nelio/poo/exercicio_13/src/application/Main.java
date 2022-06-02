package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String filePath = sc.nextLine();
		
		File sourceFile = new File(filePath);
		String sourceFolder = sourceFile.getParent();
		
		boolean success = new File(sourceFolder + "\\out").mkdir();
		System.out.println("Created folder out. [false/true]: " + success);
		
		String targetFile = sourceFolder + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String items = br.readLine();
			while (items != null) {
				String[] fields = items.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, price, quantity));
			
				items = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				for (Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.totalPrice()));
					bw.newLine();
				}
				
				System.out.println(targetFile + " CREATED!");
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();
	}
}