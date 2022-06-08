package application;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo3 {
	
	// Map

	public static void main(String[] args) {
		
		// por padrao a classe String ja tem o hashCode e equals e o compareTo
		// chave valor (Map<K, V>)
		Map<String, String> cookies = new TreeMap<>();
		
		// adicionar chave valor
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9977111122");
		
		// remover chave
		cookies.remove("email");
		
		// vai sobrescrever pois nao pode ter repeticao de chave
		cookies.put("phone", "9977111133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println();
		
		// .keySet retorna um Set<K> com as chaves do map
		// .get(K) retorna os elementos contidos na chave passada
		// imprime na ordem alfabetica definido pelo compareTo
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
	}
}