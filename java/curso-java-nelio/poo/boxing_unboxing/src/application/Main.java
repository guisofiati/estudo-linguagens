package application;

//import entities.Product;

public class Main {

	public static void main(String[] args) {
		
// 		Boxing -> conversao tipo valor para tipo referencia
		int x = 20;
		Object obj = x;
		System.out.println(x);
		System.out.println(obj);
		
// 		Unboxing -> conversao do tipo primitivo para tipo valor 
		int y = (int) obj;
		System.out.println(y);
		
// 		Erro, pois um dos atributos e um tipo primitivo e nao Wrapper classe que aceita null
		
// 		Product product = new Product("TV", null, null); 
//		System.out.println(product);

	}
}