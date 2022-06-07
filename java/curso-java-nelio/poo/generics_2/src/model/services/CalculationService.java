package model.services;

import java.util.List;

public class CalculationService {
	
	// Aqui a lista pode ser de qualquer entidade, ja que esta sendo usado um generic
	// Bom para ser usado em classes utilitarias, bom para reuso
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}