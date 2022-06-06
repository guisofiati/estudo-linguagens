package model.services;

public interface PaymentService {
	
	double interest(double amount, int months);
	double paymentFee(double amount);
}