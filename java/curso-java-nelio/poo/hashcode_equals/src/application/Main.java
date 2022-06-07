package application;

import model.entities.Client;

public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Jose", "jose@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		// compara o endereco de memoria e nao os objs em si
		System.out.println(c1 == c2);
		
		System.out.println();
		
		Client c3 = new Client("Pedro", "pedro_moraes@gmail.com");
		Client c4 = new Client("Pedro", "pedro_vargas@gmail.com");
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c3.equals(c4));
		
		System.out.println();
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		// compilador trata a expressao literal, o que se escreve, de forma diferente...
		System.out.println(s1 == s2);
		
		System.out.println();
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		// ... diferente de quando se cria um novo objeto
		System.out.println(s3 == s4);
	}
}