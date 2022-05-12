import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Ler dados na mesma linha
		
		String a;	
		int b;
		double c;
		char d;
		
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc.next().charAt(0);
		
		System.out.printf("%s %d %.2f %c\n", a, b, c, d);
		
		System.out.println("******************");
		
		// Quebra de linha pendente, dar um nextline para limpar buffer.
			
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}