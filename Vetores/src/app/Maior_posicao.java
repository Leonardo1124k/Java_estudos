package app;

import java.util.Scanner;
import java.util. Locale;

public class Maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Quantos numeros irás digitar? ");
		int quant = sc.nextInt();
		double[] num = new double[quant];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		
		double maior = 0;
		int posicaoMaior = 0;
		
		for(int i = 0; i < num.length; i++) {
			if (i == 0) {
				maior = num[i];
				posicaoMaior = i;
			} else if(i != 0 && maior < num[i]) {
				maior = num[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("\nMaior valor = " + maior);
		System.out.println("Posicao do maior valor = " + (posicaoMaior));
		
		sc.close();
	}

}
