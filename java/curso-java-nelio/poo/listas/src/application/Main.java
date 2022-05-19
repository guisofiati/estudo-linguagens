package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		System.out.print("List size = " + list.size() + " elements\n");
		System.out.println();
		System.out.println("Names of the list:");
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		for (String x : list) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println();
		
		list.add(2, "Marco");
		
		for (String x : list) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Remove names that start with the letter 'M':");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Quando nao tem e -1
	
		System.out.println();
		System.out.println("Print a new list of the names that start with letter 'A':");
		
		List<String> newList = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : newList) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Print only one name that start with letter 'J':");
		String name = newList.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Nao existe");
		
		System.out.println(name);
	}
}