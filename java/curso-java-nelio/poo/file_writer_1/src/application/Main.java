package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String[] messages = new String[] {"Good Morning", "Good Afternoon", "Good Evening"};
		
		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\saida.txt";
		
		// se passar o true como argumento no construtor do Filwriter sera acrescentado as mensagens
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String message : messages) {
				bw.write(message);
				// BufferedWriter nao tem quebra de linha
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}