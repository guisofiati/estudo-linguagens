package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo2 {
	
	//Set

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// - Uniao (juntar os 2 conjuntos)
		// no primeiro conjunto nao ha 7 e 9, entao foi adicionado
		Set<Integer> c = new TreeSet<>(a); // construtor recebe outro conjunto
		c.addAll(b);
		System.out.println(c);
		
		// - Intersecao (comum/igual nos 2 conjuntos)
		// o que no primeiro conjunto tem de igual com o segundo
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Diferenca (remover de um o que nao tem no outro)
		// remove do primeiro conjunto o que nao tem no segundo
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}