import java.util.Scanner;

public class ExercicioSomaImpares {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int X, Y, soma, temp;
		
		System.out.println("Digite dois numeros:");
		X = leitor.nextInt();
		Y = leitor.nextInt();
		
		if (X > Y) {
			temp = X;
			X = Y;
			Y = temp;
		}
		
		soma = 0;
		
		for (int i = X+1; i < Y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println();
		System.out.println("SOMA DOS IMPARES = " + soma);

		leitor.close();
	}
}