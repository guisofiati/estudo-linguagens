package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finish;
	
	private Vehicle model;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date start, Date finish, Vehicle model) {
		this.start = start;
		this.finish = finish;
		this.model = model;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getModel() {
		return model;
	}

	public void setModel(Vehicle model) {
		this.model = model;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}