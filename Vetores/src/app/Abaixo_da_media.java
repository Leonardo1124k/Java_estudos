package app;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos elementos terá o vetor? ");
		int quant = sc.nextInt();
		double[] vet = new double[quant];
		double soma = 0;
		double media;
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite o "+ (i+1) + "° numero:");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		media = soma / quant;
		
		System.out.println("\nMedia do vetor = " + media);
		System.out.println("Elementos abaixo da media do vetor:");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
