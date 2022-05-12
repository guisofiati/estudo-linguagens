import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double precoUnidade1, precoUnidade2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		precoUnidade1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		precoUnidade2 = sc.nextDouble();
		
		total = qnt1 * precoUnidade1 + qnt2 * precoUnidade2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		sc.close();
	}
}