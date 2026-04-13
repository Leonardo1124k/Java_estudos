package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a, b, c = new HashSet<>();
		
		System.out.print("Quantos estudantes para o curso A? ");
		int quant = sc.nextInt();
		a = leitura(quant);
		
		System.out.print("Quantos estudantes para o curso B? ");
		quant = sc.nextInt();
		b = leitura(quant);
		
		System.out.print("Quantos estudantes para o curso C? ");
		quant = sc.nextInt();
		c = leitura(quant);
		
		Set<Integer> total = new HashSet<>();
		total.addAll(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total de estudantes: " + total.size());
		
		sc.close();
	}
	
	
	public static Set<Integer> leitura(int quant) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < quant; i++) {
			Integer number = sc.nextInt();
			set.add(number);
		}
		
		return set;
	}
	
}
