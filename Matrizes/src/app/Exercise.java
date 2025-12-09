package app;

import java.util.Scanner;

public class Exercise {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Qual será a quantidade de linhas e colunas da matriz? ");
	int quant = sc.nextInt();
	int[][] mat = new int[quant][quant];
	
	for(int i=0; i<mat.length; i++) {
		for(int j=0; j < mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("\nDiagonal principal: ");
	for (int i = 0; i < mat.length; i++) {
		System.out.println(mat[i][i] + " ");
	}
	
	int negative = 0;
	
	for(int i = 0; i < mat.length; i++) {
		for(int j = 0; j < mat[i].length; j++) {
			if(mat[i][j] < 0) {
				negative ++;
			}
		}
	}
	
	System.out.println("Numeros negativos na matriz= " + negative);
	
	sc.close();
	}
}
