package app;

import java.util.Scanner;
import java.util.Locale;
import entities.Rooms;

public class Pensionato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rooms[] regras = new Rooms[10];
		System.out.print("Quantos quartos serão reservados? ");
		int quant = sc.nextInt();
		
		for(int i=0; i < quant; i++) {
			System.out.println("\nRent "+ (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			regras[room] = new Rooms (name, email);
		}
		
		System.out.println("\nQuartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(regras[i] != null) {
				System.out.println(i + ": " + regras[i]);
			}
		}
		
		sc.close();
	}
}
