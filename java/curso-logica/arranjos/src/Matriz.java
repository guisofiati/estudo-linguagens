import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		int M = leitor.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		int N = leitor.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = leitor.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ DIGITADA:");
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		leitor.close();
	}
}