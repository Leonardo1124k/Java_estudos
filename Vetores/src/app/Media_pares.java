package app;

import java.util.Scanner;

public class Media_pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos terá o vetor? ");
		
		int quant = sc.nextInt();
		int[] vet = new int[quant];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int soma = 0, quantPares = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				soma += vet[i];
				quantPares += 1;
			}
		}
		
		if(soma > 0) {
			double media = soma / quantPares;
			System.out.println("MEDIA DOS PARES = " + media);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
	}
}
