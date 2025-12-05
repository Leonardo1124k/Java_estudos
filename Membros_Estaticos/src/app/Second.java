package app;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Second {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Insira o raio da esfera: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", calc.PI);
		
		sc.close();
	}
}