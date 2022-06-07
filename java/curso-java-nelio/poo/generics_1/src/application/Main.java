package application;

import java.util.Scanner;

import model.entities.PrintService;

public class Main {

	public static void main(String[] args) {
		
		// Nesta classe posso definir o tipo de dado que a lista vai ter
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		// Como e um tipo generic e foi parametrizado como tipo 'T' qualquer, ativou o type safety
		//ps.addeValue("Maria");
		
		for (int i=0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addeValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First = " + x);
		
		sc.close();
	}
}