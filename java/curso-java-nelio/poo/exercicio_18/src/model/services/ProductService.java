package model.services;

import java.util.List;

import model.entities.Product;

public class ProductService {
	
	// e se a ideia e mudar o criterio do filtro? E se o nome comecar com 'G'?
	// a classe nao esta 'fechada para alteracao'... 
	// melhoria: receber outro parametro passando um predicato e o proprio usuario faz a logica de filtro
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}