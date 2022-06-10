package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 6, 9, 21, 65);
		
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Bob", "Jose");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// primeiro elemento 0, funcao de iteracao/geracao de novos elementos (predicate)
		Stream<Integer> st3 = Stream.iterate(0, p -> p + 10);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		// fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
		.map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}