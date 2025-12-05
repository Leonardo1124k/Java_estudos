package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Produto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product(); // hehehe
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quant = sc.nextInt();
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quant = sc.nextInt(); 
		product.addProducts(quant);
	
		System.out.println("Updated data: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quant = sc.nextInt(); 
		product.removeProducts(quant);
		System.out.print("Updated data: " + product);
		
		sc.close();
	}
}


//Caso eu resolvesse sem Orientacao a Objetos
//package application;
//
//import java.util.Scanner;
//import java.util.Locale;
//
//public class Exemplo2 {
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Enter the product data: ");
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Price: ");
//		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quant = sc.nextInt();
//		
//		double total = price * quant;
//		System.out.printf("\nProduct data: %s, $ %.2f, %d units -> Total: $ %.2f%n", name, price, quant, total);
//		
//		System.out.print("\nEnter the number of products to be added in stock: ");
//		quant += sc.nextInt(); 
//		
//		total = price * quant;
//		System.out.printf("Updated data: %s, $ %.2f, %d units -> Total: $ %.2f%n", name, price, quant, total);
//		
//		System.out.print("\nEnter the number of products to be removed from stock: ");
//		quant -= sc.nextInt(); 
//		
//		total = price * quant;
//		System.out.printf("Updated data: %s, $ %.2f, %d units -> Total: $ %.2f%n", name, price, quant, total);
//		
//		sc.close();
//	}
//}
