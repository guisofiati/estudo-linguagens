import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int temp;
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A < B) {
			temp = A;
			A = B;
			B = temp;
		}
		
		if (A % B != 0) {
			System.out.println("Nao sao multiplos");
		}
		else {
			System.out.println("Sao multiplos");
		}
		
		sc.close();
	}
}