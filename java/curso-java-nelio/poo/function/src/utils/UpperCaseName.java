package utils;

import java.util.function.Function;

import entities.Product;

// recebe x e vai retorna y
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}