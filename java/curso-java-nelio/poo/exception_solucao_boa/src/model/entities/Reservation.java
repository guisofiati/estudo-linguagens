package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private static final SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		long difference = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		
		if (!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date.");
		}
		
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new IllegalArgumentException("Error in reservation: Reservation update dates must be future dates.");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	@Override
	public String toString() {
		return "Reservation: Room "
				+ roomNumber 
				+ ", check-in: " 
				+ formater.format(checkIn)
				+ ", check-out: "
				+ formater.format(checkOut)
				+ ", " 
				+ duration()
				+ " night(s)";
	}
}