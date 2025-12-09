package app;

import java.util.Scanner;

public class Posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escreva quantas linhas você desejará ter na matriz: ");
		int rows = sc.nextInt();
		System.out.print("Escreva quantas colunas: ");
		int columns = sc.nextInt();
		
		int[][] mat = new int [rows][columns];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.print("Quer saber os dados sobre qual numero? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição " + i + "," + j);
					if (j > 0) {
						System.out.println("A esquerda: " + mat[i][j-1]);
					}
					if (j < mat[i].length-1) {
						System.out.println("A direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}	
		sc.close();
	}
}
