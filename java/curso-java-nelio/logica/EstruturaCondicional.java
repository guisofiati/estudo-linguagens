import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um hora: ");
		int hora = sc.nextInt();
		
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
			System.out.println("Hora invalida. Digite uma hora de 0 a 23.");;
		}

		sc.close();
	}
}