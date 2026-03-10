package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int number = sc.nextInt();
			System.out.print("Data do check in: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data do check out: ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva: " + reservation);
			
			System.out.println("\nDigite dados para atualizar a reserva: ");
			System.out.print("Data do check in: ");
		    checkIn = sdf.parse(sc.next());
			System.out.print("Data do check out: ");
		    checkOut = sdf.parse(sc.next());
			
		    reservation.updateDates(checkIn, checkOut);
		    System.out.println("Reserva: " + reservation);
		}catch(ParseException e) {
			System.out.println("Data em formato inválido");
		}catch(DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}
}