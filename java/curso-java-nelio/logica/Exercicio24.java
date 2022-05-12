import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			System.out.print(i);
			System.out.print(" " + (int)Math.pow(i, 2));
			System.out.println(" " + (int)Math.pow(i, 3));
		}
		
		sc.close();
	}
}