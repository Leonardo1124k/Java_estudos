package app;

import java.util.Scanner;
import java.util.Locale;

public class Numeros_pares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Quantos numeros iras digitar? ");
		int quant = sc.nextInt();
		int[] vet = new int[quant]; 
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt(); 
		}
		
		int quantPares = 0;
		
		System.out.print("\nNumeros pares: ");
		for (int i = 0; i < vet.length; i++) {
			if(vet[i]%2 == 0) {
				System.out.print(vet[i] + " ");
				quantPares += 1;
			}
		}
		
		System.out.println("\nQuantidade de pares = " + quantPares);
		
		
		sc.close();
	}

}
