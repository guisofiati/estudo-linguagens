import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		
		System.out.print("Bom dia");
		System.out.print("Boa noite");
		
		System.out.println("***********");
		
		System.out.println("Bom dia");
		System.out.println("Boa noite");
		
		System.out.println("***********");
		
		int a = 20;
		
		System.out.println(a);
		
		System.out.println("***********");
		
		double x = 10.35632;
		
		System.out.println(x);
		System.out.printf("%.4f\n", x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println(String.format("%.2f", x));
		System.out.printf("RESULTADO = %.2f\n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.println("***********");
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4500.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais mensais%n", nome, idade, renda);
	}
}