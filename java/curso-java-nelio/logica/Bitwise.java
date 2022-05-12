import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89; // 0101 1001
		int n2 = 60; // 0011 1100
		
		System.out.println(n1 & n2); // 0001 1000 (24)
		System.out.println(n1 | n2); // 0111 1101 (125)
		System.out.println(n1 ^ n2); // 0110 0101 (101)
		
		System.out.println("***********");
		
		int mask = 0b00100000; // ou 32
		 
		int n = sc.nextInt(); // (89 = 0101 1001) (125 = 0111 1101)
		
		if ((n & mask) == 0) {
			System.out.println("6o bit e falso");
		} 
		else {
			System.out.println("6o bit e verdadeiro");
		}

		sc.close();
	}
}