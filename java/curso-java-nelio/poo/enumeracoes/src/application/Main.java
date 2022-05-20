package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order(1102, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		// Atribui o valor para uma variavel 'os1'
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		// Erro, nao ha um enum 'LOADING' no OrderStatus
		// OrderStatus os2 = OrderStatus.valueOf("LOADING"); 
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); 
		
		System.out.println(os1);
		System.out.println(os2);
	}
}