import java.util.Scanner;

public class ExercicioMenorDeTres {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1, n2, n3, menor;
		
		System.out.print("Primeiro valor: ");
		n1 = leitor.nextInt();
		System.out.print("Segundo valor: ");
		n2 = leitor.nextInt();
		System.out.print("Terceiro valor: ");
		n3 = leitor.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			menor = n1;
		}
		else if (n2 <= n3) {
			menor = n2;
		}
		else {
			menor = n3;
		}
		
		System.out.println();
		System.out.println("MENOR = " + menor);

		leitor.close();
	}
}