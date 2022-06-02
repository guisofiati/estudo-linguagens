package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		System.out.println("Nome do arquivo: " + path.getName());
		System.out.println("Diretorio do arquivo: " + path.getParent());
		System.out.println("Caminho completo do arquivo: " + path.getPath());
		System.out.println("Caminho absoluto do arquivo: " + path.getAbsolutePath());

		sc.close();
	}
}