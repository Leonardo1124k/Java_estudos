package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.ImportedProduct;
import entities2.Product;
import entities2.UsedProduct;

public class Exercise {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList<>();
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do produto #" + (i+1) + ": ");
			System.out.print("Comum, usado ou importado? ");
			char resp = sc.next().charAt(0);
			if (resp == 'c' || resp == 'u' || resp =='i') {
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Preço: ");
				Double price = sc.nextDouble();
				if(resp == 'i') {
					System.out.print("Taxa alfandegaria: ");
					Double fee = sc.nextDouble();
					Product pd2 = new ImportedProduct(name, price, fee);
					list.add(pd2);
				}else if (resp == 'u') {
					DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					System.out.print("Data de criação (DD/MM/YYYY): ");
					sc.nextLine();
					String dt = sc.nextLine();
					LocalDate dt4 = LocalDate.parse(dt, fmt1);
					Product pd3 = new UsedProduct(name,price,dt4);
					list.add(pd3);
				}
				else {
					//Ou seja, resp == C
					Product pd = new Product(name, price);
					list.add(pd);
				}
			}
			else {
				System.out.println("TIPO DE PRODUTO INEXISTENTE. ERRO");
			}
		}
		
		System.out.println("\nPreço das etiquetas: ");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}