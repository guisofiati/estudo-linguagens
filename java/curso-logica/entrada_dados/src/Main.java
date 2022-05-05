import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade;
		char sexo;
		
		System.out.print("Nome da primeira pessoa: ");
		nome1 = leitor.nextLine();
		System.out.print("Salario da primeira pessoa: ");
		salario1 = leitor.nextDouble();
		
		System.out.println();
		
		System.out.print("Nome da segunda pessoa: ");
		leitor.nextLine();
		nome2 = leitor.nextLine();
		System.out.print("Salario da segunda pessoa: ");
		salario2 = leitor.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite uma idade: ");
		idade = leitor.nextInt();
		
		System.out.println();
		
		System.out.print("Digite um sexo [M/F]: ");
		sexo = leitor.next().charAt(0);
		
		System.out.println();
		System.out.println("Nome 1: " + nome1);
		System.out.println("Salario 1: " + String.format("%.2f", salario1));
		System.out.println("Nome 2: " + nome2);
		System.out.println("Salario 2: " + String.format("%.2f", salario2));
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		
		leitor.close();
	}
}