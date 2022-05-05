import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int N;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = leitor.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = leitor.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i = 0; i < N; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
		System.out.println();
		
		soma = 0.0;
		
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / N;
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		leitor.close();
	}
}