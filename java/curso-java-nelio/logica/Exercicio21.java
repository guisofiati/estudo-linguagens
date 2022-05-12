import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			int numerador = sc.nextInt();   // Dividendo
			int denominador = sc.nextInt(); // Divisor
			
			if (denominador == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
				double resultado = (double) numerador / denominador;
				System.out.printf("%.1f\n", resultado);
			}
		}
		
		sc.close();
	}
}