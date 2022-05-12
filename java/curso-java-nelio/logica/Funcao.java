import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		
		// Parametros = variaveis que vao receber um valor na funcao/metodo
		// Argumentos = O que e passado para a funcao/metodo
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if (a > b && a > c) {
//			System.out.println("Maior = " + a);
//		}
//		else if (b > c) {
//			System.out.println("Maior = " + b);
//		}
//		else {
//			System.out.println("Maior = " + c);
//		}
		
		// Passando 3 argumentos
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
	}
	
	// Funcao que tera retorno inteiro passando 3 parametros inteiros
	public static int max(int x, int y, int z) { 
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	// Funcao sem retorno
	public static void showResult(int valor) {
		System.out.println("Maior = " + valor);
	}
}