import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
	
		int soma = 0;
		
		while (X != 0) {
			soma += X;
			
			X = sc.nextInt();
		}
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}