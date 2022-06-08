package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo1 {

	public static void main(String[] args) {
		
		// HashSet -> mais rapido / nao ordenado
		// TreeSet -> mais lento / ordenado pelo compareTo
		// LinkedHashSet -> velocidade intermediaria / ordem que sao inseridos
		
		// Set n aceita repeticoes / nao tem posicao como a List
		Set<String> hash = new HashSet<>();

		hash.add("Tv");
		hash.add("Tablet");
		hash.add("Notebook");
		
		System.out.println(hash.contains("Notebook"));
		System.out.println(hash.contains("Geladeira"));
		
		// Ordem aleatoria
		for (String obj : hash) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Set<Integer> tree = new TreeSet<>();
		
		tree.add(3);
		tree.add(10);
		tree.add(14);
		tree.add(6);
		tree.add(6);
		
		System.out.println(tree.contains(6));
		
		// Ordenados pelo compareTo do Comparable
		for (Integer obj : tree) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Set<Double> linked = new LinkedHashSet<>();
		
		linked.add(3.14);
		linked.add(5.33);
		linked.add(10.2);
		linked.add(4.56);
		
		System.out.println(linked.contains(5.32));
		
		// Na ordem em que foram adicionados
		for (Double obj : linked) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Set<String> newHash = new HashSet<>();
		
		newHash.add("Michael");
		newHash.add("Mariana");
		newHash.add("Joao");
		newHash.add("Pedro");
		newHash.add("Jose");
		
		newHash.remove("Michael");
		newHash.removeIf(x -> x.charAt(0) == 'J');
		newHash.removeIf(x -> x.length() == 5);
		
		for (String obj : newHash) {
			System.out.println(obj);
		}
	}
}