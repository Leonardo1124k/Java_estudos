package app;

import java.util.Scanner;
import java.util.Locale;

public class Soma_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Quantos numeros irás digitar? ");
		int quant = sc.nextInt();
		double[] vet = new double[quant];
		
		for(int i=0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		System.out.print("\nValores: ");
		for(int i=0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];
		}
		
		double media = soma / vet.length;
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Media: " + media);
		
		sc.close();
	}

}
