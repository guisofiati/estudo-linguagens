import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 20;
		salario = 5800.0;
		altura = 1.63;
		genero = 'F';
		nome = "Maria Silva";
		
		System.out.println("IDADE = " + idade);
		
		// 2 casas decimais
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
	}
}