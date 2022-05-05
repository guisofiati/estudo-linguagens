import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		System.out.print("Bom dia");
		System.out.print("Boa tarde");
		
		System.out.println();
		System.out.println("******************");
		
		System.out.println("Bom dia");
		System.out.println("Boa tarde");
		
		System.out.println("******************");
		
		int a, b;
		
		a = 10;
		b = 20;
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("******************");
		
		double c;
		
		c = 2.3456;
		
		System.out.println(String.format("%.2f", c));
		
		System.out.println("******************");
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 32;
		salario = 4560.9;
		nome = "Maria Silva";
		sexo = 'F';
		
		System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " +
		String.format("%.2f", salario) + " e tem " + idade + " anos");	
	}
}