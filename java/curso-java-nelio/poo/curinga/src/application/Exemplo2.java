package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 5.13);
		List<Object> myObjs = new ArrayList<>();
		
		// Erro, pois a segunda lista DEVE ser qualquer lista SUPERTIPO de Number
		// e no caso que foi passado é um SUBTIPO de Number.
		//copy(myInts, myDoubles);
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	// Copiar de qualquer lista que seja de QUALQUER SUBTIPO de Number (covariancia {get})
	// para qualquer lista que seja SUPERTIPO de Number. (contravariancia {put})
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	// Qualquer tipo de lista
	public static void printList(List<?> list) {
		// Object o tipo mais generico possivel
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}