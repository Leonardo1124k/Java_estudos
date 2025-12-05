package app;

import java.util.Scanner;
import java.util.Locale;

public class Study {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quantas alturas serão digitadas: ");
		int quant = sc.nextInt();
		double[] vect = new double [quant];
		double soma = 0;
		for (int i = 0; i < quant; i++) {
			System.out.print( (i+1) + "° altura: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma/quant;
		System.out.println();
		System.out.printf("Altura media: %.2f%n", media);
		
		sc.close();
	}
}
