package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Study2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos produtos serão digitados? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("Nome do %d° produto: ", (i + 1));
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: R$");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("\nAverage price = %.2f%n", avg);

		sc.close();
	}
}
