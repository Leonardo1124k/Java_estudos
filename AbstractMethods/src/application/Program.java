package application;

import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Digite o número de formas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n+1; i++) {
			System.out.println("Dados da forma " + i + ":");
			System.out.print("Retangulo ou circulo (c/r)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Cor (PRETA/AZUL/VERMELHA): ");
			Color color = Color.valueOf(sc.next());
			if(resp == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println("\nTamanho das áreas: ");
		for(Shape sh : list) {
			System.out.printf("%.2f ", sh.area());
		}
		
		sc.close();
		
	}
}
