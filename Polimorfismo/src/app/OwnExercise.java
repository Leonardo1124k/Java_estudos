//package app;
//
//import java.util.Scanner;
//
//import entities3.Ticket;
//import entities3.TicketVIP;
//import entities3.TicketStudent;
//import java.util.Locale;
//
//public class OwnExercise {
//	public static void main (String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Ingressos do Show do Léo");
//		System.out.print("Digite o número de ingressos: ");
//		int n = sc.nextInt();
//		Ticket[] vect= new Ticket[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println("Dados do Ingresso " + (i + 1) + ":");
//			System.out.print("O ingresso é normal, VIP ou de estudante? (n,v,e) ");
//			char resp = sc.next().charAt(0);
////			sc.next();
//			if(resp == 'n' || resp == 'v' || resp == 'e') {
//				System.out.print("Nome do Evento: ");
//				String eventName = sc.nextLine();
//				sc.next();
//				System.out.print("Preço: R$");
//				Double basePrice = sc.nextDouble();
//				if(resp == 'v') {
//					System.out.print("Taxa adicional: R$");
//					Double addValue = sc.nextDouble();
//					vect[i] = new TicketVIP(eventName, basePrice, addValue);
//				}else if(resp == 'e') {
//					System.out.print("Qual o nome da instituição? ");
//					String institution = sc.nextLine();
//					sc.next();
//					vect[i] = new TicketStudent(eventName, basePrice, institution);
//				}else {
//					vect[i] = new Ticket(eventName, basePrice);
//				}
//			}
//			else {
//				System.out.println("TIPO DE INGRESSO INEXISTENTE.");
//			}
//		}
//		System.out.println("\nResumo: ");
//		for (int i=0; i < n; i++) {
//			System.out.println(vect[i].recibo());
//		}
//		
//	
//		sc.close();
//	}
//}
package app;

import java.util.Scanner;

import entities2.Product;
import entities3.Ticket;
import entities3.TicketVIP;
import entities3.TicketStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class OwnExercise {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingressos do Show do Léo");
		System.out.print("Digite o número de ingressos: ");
		int n = sc.nextInt();
		List<Ticket> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do Ingresso " + (i + 1) + ":");
			System.out.print("O ingresso é normal, VIP ou de estudante? (n,v,e) ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			if(resp == 'n' || resp == 'v' || resp == 'e') {
				System.out.print("Nome do Evento: ");
				String eventName = sc.nextLine();
				System.out.print("Preço: R$");
				Double basePrice = sc.nextDouble();
				if(resp == 'v') {
					System.out.print("Taxa adicional: R$");
					Double addValue = sc.nextDouble();
					list.add(new TicketVIP(eventName, basePrice, addValue));
				}else if(resp == 'e') {
					System.out.print("Qual o nome da instituição? ");
					sc.nextLine();
					String institution = sc.nextLine();
					list.add(new TicketStudent(eventName, basePrice, institution));
				}else {
					list.add(new Ticket(eventName, basePrice));
				}
			}
			else {
				System.out.println("TIPO DE INGRESSO INEXISTENTE.");
			}
		}
		System.out.println("\nResumo: ");
		
		for (Ticket t : list) {
			System.out.println(t.recibo());
		}
		
		sc.close();
	}
}

