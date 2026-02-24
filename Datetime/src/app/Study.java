package app;

//INSTANCIANDO DATA-HORA EM JAVA

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate dt1 = LocalDate.now();
		LocalDateTime dt2 = LocalDateTime.now();
		Instant dt3 = Instant.now();
		
		LocalDate dt4 = LocalDate.parse("2025-07-20");
		LocalDateTime dt5 = LocalDateTime.parse("2025-07-20T01:30:26");
		Instant dt6 = Instant.parse("2025-07-20T01:30:26Z");
		Instant dt7 = Instant.parse("2025-07-20T01:30:26-03:00");
		LocalDate dt8 = LocalDate.parse("20/07/2025", fmt1);
		LocalDate dt9 = LocalDate.parse("20/07/2025 01:30", fmt2);
		LocalDate dt10 = LocalDate.of(2025, 7, 20);
		LocalDateTime dt11 = LocalDateTime.of(2025, 7, 20, 1, 30);
		
		System.out.println("Local date = " + dt1.toString());//toString já é usado em todos na verdade
		System.out.println("Local datetime and fractions of secs = " + dt2);
		System.out.println("Date time instant in GMT(London) = " + dt3);
		System.out.println("Past local date = " + dt4);
		System.out.println("Past local datetime and secs = " + dt5);
		System.out.println("Past local datetime and secs GMT = " + dt6);
		System.out.println("Past local datetime and secs UTC SP = " + dt7);
		System.out.println("\033[0;30;43mPassando como parametro a data em dd/mm/yyyy\033[m = " + dt8);
		System.out.println("Passando como parametro a data em dd/mm/yyyy e horas = " + dt9);
		System.out.println("Passando como parametro a data em ano, mes, dia separados = " + dt10);
		System.out.println("Passando como parametro a data em ano, mes, dia, hora, seg separados = " + dt11);
		
		
		
	}

}
