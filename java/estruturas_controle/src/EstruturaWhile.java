import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x, soma;
		
		System.out.print("Digite o primeiro numero: ");
		x = leitor.nextInt();
		
		soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			
			System.out.print("Digite outro numero: ");
			x = leitor.nextInt();
		}
		
		System.out.println("SOMA = " + soma);
		
		leitor.close();
	}
}