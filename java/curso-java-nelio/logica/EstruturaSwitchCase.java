import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String dia = "";
		
		switch(num) {
		case 1:
			dia = "Segunda-Feira";
			break;
		case 2: 
			dia = "Terca-Feira";
			break;
		case 3:
			dia = "Quarta-Feira";
			break;
		case 4: 
			dia = "Quinta-Feira";
			break;
		case 5:
			dia = "Sexta-Feira";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Valor invalido. Digite um numero de 1 a 7.";
			break;
		}
		
		System.out.println("DIA DA SEMANA = " + dia);
		
		sc.close();
	}
}