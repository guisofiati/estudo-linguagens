import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int num;
		int in = 0;
		
		for (int i=0; i<X; i++) {
			num = sc.nextInt();
			
			if (num >= 10 && num <= 20) {
				in++;
			}
		}
		
		int out = X - in;
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}