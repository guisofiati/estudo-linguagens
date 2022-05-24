package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do programa");
	}
	
	public static void method1() {
		System.out.println("**** METHOD 1 START ****"); 
		method2();
		System.out.println("**** METHOD 1 END ****"); 
	}
	
	public static void method2() {
		System.out.println("**** METHOD 2 START ****"); 
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!");
			e.printStackTrace(); // Imprime a 'pilha de chamadas' que gerou a excecao
		}
		catch (InputMismatchException e) {
			System.out.println("Entrada invalida!");
		}
		
		sc.close();
		System.out.println("**** METHOD 2 END ****"); 
	}
}