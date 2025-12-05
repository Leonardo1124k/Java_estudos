package application; //Defino o pacote a qual pertence o arquivo

import java.util.Locale; // java.util -> pacote da bilioteca padrão/global; Locale é a classe importada
import java.util.Scanner; // java.util -> pacote da biblioteca; Scanner é a classe importada

import entities.Triangle; // entities -> pacote; Triangle -> a classe importada

public class Triangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		char larger; // crio variavel char inicial vazia
		
		Triangle x, y; // crio variaveis de referencia
		x = new Triangle(); // crio um objeto/instancia da classe Triangle
		y = new Triangle(); // crio outro objeto/instancia da classe Triangle
		//Tudo que fiz até aqui, permitirá que os objetos (x e y) recebam valores pelos atributos
		//a,b,c
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); //atributo a (lado) de X (objeto/instancia da classe Triangle)
		x.b = sc.nextDouble(); //atributo b (lado) de Y
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // variavel igual ao metodo area do objeto x na entidade/classe
		double areaY = y.area(); // variavel igual ao metodo area do objeto y na entidade/classe
				
		if (areaX > areaY) {
			larger = 'X';
		}else {
			larger = 'Y';
		}
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.printf("Larger area: triangle %s%n", larger);
		
		sc.close();
	}
}
