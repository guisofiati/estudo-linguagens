import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x, y, z;
		
		x = leitor.nextInt();
		System.out.println(x);
		y = 2 * x;
		System.out.println(y);
		z = leitor.nextInt();
		System.out.println(z);
		
		leitor.close();
	}
}