import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double F, C;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = leitor.nextDouble();
			
			F = 9.0 * C / 5.0 + 32.0;
			
			System.out.println("Equivalente em Fahrenheit: " + String.format("%.1f", F));
			System.out.println("Deseja repetir? [S/N]: ");
			resp = leitor.next().charAt(0);
			
		} while (resp == 's');
		
		leitor.close();
	}
}