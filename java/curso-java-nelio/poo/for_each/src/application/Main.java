package application;

public class Main {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Maria", "Joao", "Pedro", "Andre"};
		
		for (int i=0; i<nomes.length; i++) {
			System.out.print(nomes[i] + " ");
		}
		
		System.out.println();
		System.out.println("*******************");
		
		for (String obj : nomes) {
			System.out.print(obj + " ");
		}
	}
}