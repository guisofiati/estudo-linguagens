package application;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Inicializar uma lista
		List<Integer> myInts = Arrays.asList(3, 5, 12);
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("Maria", "Bob", "Jose");
		printList(myStrings);
	}
	
	public static void printList(List<?> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		for (Object obj : list) {
			//list.add(10); - erro. Por ser um curinga ele nao sabe o tipo que sera a lista
			System.out.println(obj);
		}
	}
}