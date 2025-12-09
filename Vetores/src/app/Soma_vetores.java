package app;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores terá cada vetor? ");
		int quant = sc.nextInt();
		int[] vetA = new int[quant];
		int[] vetB = new int[quant];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vetB.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vetA.length; i++) {
			System.out.println(vetA[i] + vetB[i]);
		}
		
		sc.close();
	}

}
