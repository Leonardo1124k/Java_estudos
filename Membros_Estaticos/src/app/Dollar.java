package app;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Dollar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual é o preço do dolar atualmente? R$");
		double dollar = sc.nextDouble();
		System.out.print("Quantos dolares serão comprados? R$");
		double buy = sc.nextDouble();
		System.out.printf("\nValor a ser pago em reais: %.2f%n", CurrencyConverter.Pay(dollar,buy));
		
		
		sc.close();
	}
}
