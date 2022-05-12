import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.println(F);
			
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();
	}
}