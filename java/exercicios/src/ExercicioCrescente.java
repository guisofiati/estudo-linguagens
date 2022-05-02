import java.util.Scanner;

public class ExercicioCrescente {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int n1 = leitor.nextInt();
		int n2 = leitor.nextInt();
		
		while (n1 != n2) {
			
			if (n1 > n2) {
				System.out.println("DECRESCENTE!");
			}
			else {
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite outros dois numeros:");
			n1 = leitor.nextInt();
			n2 = leitor.nextInt();
		}
		
		leitor.close();
	}
}