import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int codigo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (codigo != 4) {
			
			switch (codigo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
			
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}