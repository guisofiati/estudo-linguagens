package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private PaymentService paymentService;
	
	public ContractService() {
	}
	
	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		for (int i=1; i<=months; i++) {
			
			cal.add(Calendar.MONTH, 1);
			Date dateInstallement = cal.getTime();
			
			double partialTotal = contract.getTotalValue() / months;
			double totalWithTax = paymentService.interest(partialTotal, i);
			double total = paymentService.paymentFee(totalWithTax);
			
			contract.getInstallments().add(new Installment(dateInstallement, total));
		}
	}
}