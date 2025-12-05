package course;

import java.util.Scanner;

public class Estudo { // Isso é uma classe
	public static void main(String[] args) { // Isso é uma função (main)
											//Aquela que será executada em primeiro lugar (entry point)
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite tres numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = maior(a,b,c);
		showResult(maior);
		
		sc.close();
	}
	
	public static int maior(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else{
			aux = z;
		} 
		return aux;
	}
	
	public static void showResult(int valor) {
		System.out.println("Maior valor = " + valor);
	}
}
