package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<vet.length; i++) {
			sum += vet[i];
		}
		
		double average = sum / vet.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f\n", average);
		
		sc.close();
	}
}