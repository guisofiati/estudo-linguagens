import java.util.Locale;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int w, x, y, z;
		
		x = 5;
		y = 3;
		z = (x > y) ? 10 : 20;
		w = (x < y) ? 100 : 200;
		
		System.out.println(z);
		System.out.println(w);
		
		System.out.println("**********");
		
		String nome = (x < y) ? "Jose" : "Maria";
		
		System.out.println(nome);
		
		System.out.println("**********");
		
		double price = 35.00;
		double discount;
		
		if (price < 20.00) {
			discount = price * 0.1;
		} else {
			discount = price * 0.5;
		}
		
		System.out.printf("Discount = %.2f\n", discount);
		
		System.out.println("**********");
		
		double preco = 35.00;
		double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.5;
		
		System.out.printf("Desconto = %.2f\n", desconto);
	}
}