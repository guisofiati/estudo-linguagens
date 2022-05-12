public class ProcessamentoDados {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 5;
		b = 2 * a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("****************");
		
		int c;
		double d;
		
		c = 5;
		d = 2 * c;
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("***********");
		
		double b1, b2, h, area;
		
		b1 = 6.0;
		b2 = 8.0;
		h = 5.0;
		
		area = (b1 + b2) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("***********");
		
		int e, f;
		double resultado;
		
		e = 5;
		f = 2;
		
		resultado = e / f;
		
		System.out.println(resultado);
		
		System.out.println("***********");
		
		// Casting conversao explicita de um tipo para outro

		int e2, f2;
		double resultado2;
		
		e2 = 5;
		f2 = 2;
		
		resultado2 = (double) e2 / f2;
		
		System.out.println(resultado2);
		
		System.out.println("***********");
		
		double i;
		int j;
		
		i = 5.0;
		//j = i;
		j = (int)i;
		
		System.out.println(j);
	}
}