import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int hora;
		
		System.out.print("Digite uma hora: ");
		hora = leitor.nextInt();
		
		if (hora >= 0 && hora < 6) {
			System.out.println("Boa madrugada!");
		}
		else if (hora < 13) {
			System.out.println("Bom dia!");
		} 
		else if (hora < 19) {
			System.out.println("Boa tarde!");
		}
		else if (hora < 24) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Hora invalida. Digite uma hora de 0 a 23.");
		}
		
		leitor.close();
	}
}