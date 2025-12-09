package app;

import java.util.Scanner;
import java.util.Locale;

import entities.Dados;

public class Alturas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int quant = sc.nextInt();
		Dados[] vet = new Dados[quant];
		
		for(int i=0; i < vet.length; i++) {
			System.out.printf("Dados da %dª pessoa: ", (i+1));
			System.out.print("\nNome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vet[i] = new Dados(name,age,height);
		}
		
		double soma = 0;
		int menores = 0;
		
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i].getHeight();
			if(vet[i].getAge() < 16) {
				menores += 1;
			}
		}
		
		double media = soma / vet.length;
		double perc = (double) menores / vet.length * 100;
		
		System.out.print("\nAltura media: " + String.format("%.2f", media));
		System.out.println("\nPessoas com menos de 16 anos: " + String.format("%.2f", perc) + "%");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i].getAge() < 16){
				System.out.println(vet[i].getName());
			}
		}
		
		
		sc.close();
	}
}
