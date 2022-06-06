package model.services;

public class PaypalService implements PaymentService {
	
	private static final double SIMPLE_INTEREST = 0.01;
	private static final double PAYMENT_FEE = 0.02;
	
	@Override
	public double interest(double amount, int months) {
		return amount += amount * SIMPLE_INTEREST * months;
	}
	
	@Override
	public double paymentFee(double amount) {
		return amount += amount * PAYMENT_FEE;
	}
}