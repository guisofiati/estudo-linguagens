package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (DD/MM/YYYY): ");
			Date checkIn = formater.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			Date checkOut = formater.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
		
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = formater.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = formater.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		
		// Obrigado a tratar pois a DomainException extende a Exception
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		// Para nao quebrar por outra possivel outra Runtime inesperada
		// Ex: no campo de digitar o numero do quarto entrar com letras
		// E um tipo de excecao mais generico com uma mensagem generica
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}
}