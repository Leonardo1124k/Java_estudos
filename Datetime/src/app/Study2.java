package app;

import java.time.Instant;

//Convertendo data-hora para texto

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Study2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt4 = LocalDate.parse("2025-07-20");
		LocalDateTime dt5 = LocalDateTime.parse("2025-07-20T01:30:26");
		Instant dt6 = Instant.parse("2025-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("dt4 = " + dt4.format(fmt1));
		System.out.println("dt4 = " + fmt1.format(dt4));
		System.out.println("dt4 = " + dt4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
		System.out.println("dt5 = " + dt5.format(fmt1));
		System.out.println("dt5 = " + dt5.format(fmt2));
		System.out.println("dt5 = " + dt5.format(fmt4));
		
		
		System.out.println("dt6 = " + fmt3.format(dt6));
		System.out.println("dt6 = " + fmt5.format(dt6));
		System.out.println("dt6 = " + dt6);
	}

}
