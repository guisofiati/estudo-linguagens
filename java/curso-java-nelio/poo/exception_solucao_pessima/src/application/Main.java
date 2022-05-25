package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY): ");
		Date checkIn = formater.parse(sc.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = formater.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date.");
		}
		else if (checkIn.before(now) || checkOut.before(now)) {
			System.out.println("Error in reservation: Reservation dates must be future dates.");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
		
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = formater.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = formater.parse(sc.next());
			
			if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date.");
			}
			else if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation update dates must be future dates.");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println(reservation);
			}
		}
		
		sc.close();
	}
}