package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = Date.from(Instant.parse("2022-05-18T17:42:03Z"));
		
		System.out.println(formater.format(date));
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		// Adicionar 4 horas na data
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		// Pegar hora, minutos, segundos e mes da data
		int hours = cal.get(Calendar.HOUR); 
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		int month = 1 + cal.get(Calendar.MONTH);
		date = cal.getTime();
		System.out.println("Added 4 hours in date: " + formater.format(date));
		
		System.out.println();
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		System.out.println("Month: " + month);
	}
}