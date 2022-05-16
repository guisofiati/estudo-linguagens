package utils;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double totalToPay(double price, double amount) {		
		double calculate = price * amount;
		
		// calc = calc + (calc * IOF)
		return calculate += calculate * IOF;
	}
}