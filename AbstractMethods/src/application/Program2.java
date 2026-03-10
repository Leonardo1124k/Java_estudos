package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.Tax;
import entities2.TaxPF;
import entities2.TaxPJ;

public class Program2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Tax> list = new ArrayList<>();
		
		System.out.print("Digite quantos contribuintes serão atendidos: ");
		int n = sc.nextInt();
		for (int i=1; i < n+1; i++) {
			System.out.print("O contribuinte "+ i + " é pessoa física ou jurídica (F/J)? ");
			char resp = sc.next().charAt(0);
			if(resp == 'F' || resp == 'J') {
				System.out.print("Qual o nome do contribuinte? ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Qual o valor arrecadado no ano? R$");
				double annualIncome = sc.nextDouble();
				if(resp == 'F') {
					System.out.print("Gastos com saúde: R$");
					double healthMoney = sc.nextDouble();
					list.add(new TaxPF(name,annualIncome,healthMoney));
				}
				else if(resp == 'J') {
					System.out.print("Número de empregados: ");
					int employeeNumber = sc.nextInt();
					list.add(new TaxPJ(name,annualIncome,employeeNumber));
				}
			 }
			else {
				System.out.println("ERRO, TIPO DE PESSOA NÃO EXISTE.");
			}
		}
		
		System.out.println("\nImpostos a pagar: ");
		double total = 0;
		for(Tax tax: list) {
			System.out.println(tax.paymentString());
			total += tax.totalPayment();
		}
		
		System.out.println("\nTotal de impostos: R$" + total);
		
		sc.close();
	}
}
