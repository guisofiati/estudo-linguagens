import java.util.Scanner;

public class ExercicioDiagonalNegativos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int N, contador;
		
		System.out.print("Qual a ordem da matriz? ");
		N = leitor.nextInt();
		
		int[][] mat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = leitor.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		contador = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS: " + contador);
		
		leitor.close();
	}
}