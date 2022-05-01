import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int N, X, soma;
		
		System.out.print("Quantos numeros serao digitados? ");
		N = leitor.nextInt();
		
		soma = 0;
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Digite um numero: ");
			X = leitor.nextInt();
			
			soma = soma + X;
		}
		
		System.out.println("SOMA = " + soma);

		leitor.close();
	}
}