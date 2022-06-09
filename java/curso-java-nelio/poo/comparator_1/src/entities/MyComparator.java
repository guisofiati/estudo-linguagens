package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	// positivo: primeiro maior que o segundo
	// negativo: primeiro menor que o segundo
	// neutro: numeros iguais
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
	}
}