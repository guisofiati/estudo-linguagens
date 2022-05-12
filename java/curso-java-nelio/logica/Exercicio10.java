import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaInicial >= horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
		} 
		else {
			duracao = horaFinal - horaInicial;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
}