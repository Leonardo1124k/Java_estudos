package app;

import java.util.Locale;
import java.util.Scanner;
import util.Final_calculator;

public class Final {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o raio da esfera: ");
		double radius = sc.nextDouble();
		
		double c = Final_calculator.circumference(radius);
		double v = Final_calculator.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", Final_calculator.PI);
		
		sc.close();
	}
}