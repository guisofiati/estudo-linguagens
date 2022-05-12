import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble(); 
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		circulo = 3.14159 * Math.pow(C, 2.0);
		trapezio = (A + B) * C / 2.0;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.println("TRIANGULO = " + String.format("%.3f", triangulo));
		System.out.println("CIRCULO = " + String.format("%.3f", circulo));
		System.out.println("TRAPEZIO = " + String.format("%.3f", trapezio));
		System.out.println("QUADRADO = " + String.format("%.3f", quadrado));
		System.out.println("RETANGULO = " + String.format("%.3f", retangulo));
		
		sc.close();
	}
}