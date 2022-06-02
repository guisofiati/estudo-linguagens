package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String folderPath = sc.nextLine();
		
		// File pode ser tanto diretorio como arquivo
		File path = new File(folderPath);
		
		System.out.println();
		
		// Usando um reference method para listar apenas os diretorios do path passado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		// Usando um reference method para listar apenas os arquivos do path passado
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		// criando uma subpasta no path passado
		boolean success = new File(folderPath + "\\subpasta").mkdir();
		System.out.println("Directory created. " + success);
		
		sc.close();
	}
}