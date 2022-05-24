package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		}
		
		// Posicao do array nao existe
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!");
		}
		
		// Erro de entrada, tipos diferentes
		catch (InputMismatchException e) {
			System.out.println("Entrada invalida!");
		}
		
		// Sem o tratamento de excecoes, essa mensagem nao e impressa.
		System.out.println("Fim do programa");
		
		sc.close();
	}
}