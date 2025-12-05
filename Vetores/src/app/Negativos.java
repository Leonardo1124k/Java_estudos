package app;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos numeros irás digitar? ");
		
		int quant = sc.nextInt();
		int[] vet = new int[quant];
		
		for(int i=0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
			
		sc.close();
	}

}
