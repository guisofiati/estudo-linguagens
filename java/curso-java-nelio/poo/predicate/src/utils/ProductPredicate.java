package utils;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	// se o preco do produto for maior ou igual a 100 retorna true
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}
}