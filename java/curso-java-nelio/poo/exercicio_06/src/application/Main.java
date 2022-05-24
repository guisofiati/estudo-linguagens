package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hostel;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hostel[] vet = new Hostel[9];
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("RENT #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vet[room] = new Hostel(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}