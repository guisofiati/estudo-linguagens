package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		// Formatador de datas
		SimpleDateFormat formater1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formater2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat formater3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		formater3.setTimeZone(TimeZone.getTimeZone("GMT")); // ISO 8601
		
		Date date1 = formater1.parse("18/05/2022");
		Date date2 = formater2.parse("18/05/2022 10:53:23");
		Date date3 = new Date();
		Date data4 = new Date(System.currentTimeMillis());
		Date data5 = new Date(0L); // milissegundos
		Date data6 = new Date(1000L * 60L * 60L * 5L);
		Date data7 = Date.from(Instant.parse("2022-05-18T15:01:32Z"));
		
		// Padrao de print do Java
		System.out.println("Data 1 = " + date1);
		System.out.println("Data 2 = " + date2);
		System.out.println("Data 3 = " + date3);
		System.out.println("Data 4 = " + data4);
		System.out.println("Data 5 = " + data5);
		System.out.println("Data 6 = " + data6);
		System.out.println("Data 7 = " + data7);
		
		// Formatado em UTC
		System.out.println();
		System.out.println("Data 1 = " + formater1.format(date1));
		System.out.println("Data 2 = " + formater2.format(date2));
		System.out.println("Date 3 = " + formater2.format(date3));
		System.out.println("Data 4 = " + formater2.format(data4));
		System.out.println("Data 5 = " + formater2.format(data5));
		System.out.println("Data 5 = " + formater2.format(data6));
		System.out.println("Data 5 = " + formater2.format(data7));
		
		// Formatado em GMT
		System.out.println();
		System.out.println("Data 1 = " + formater3.format(date1));
		System.out.println("Data 2 = " + formater3.format(date2));
		System.out.println("Date 3 = " + formater3.format(date3));
		System.out.println("Data 4 = " + formater3.format(data4));
		System.out.println("Data 5 = " + formater3.format(data5));
		System.out.println("Data 5 = " + formater3.format(data6));
		System.out.println("Data 5 = " + formater3.format(data7));
	}
}