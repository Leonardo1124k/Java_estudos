//package application;
//
//import java.util.Locale;
//import java.util.Scanner;
//import entities.Rectangle;
//
//public class Retangulo {
//	public static void main (String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner (System.in);
//		
//		Rectangle rect = new Rectangle();
//		
//		System.out.println("Enter the rectangle width and height: ");
//		rect.width = sc.nextDouble();
//		rect.height = sc.nextDouble();
//		System.out.printf("AREA = %.2f%n", rect.area());
//		System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
//		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
//		
//		sc.close();
//	}
//}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Retangulo{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec;
		rec = new Rectangle();
		
		System.out.println("Insira a largura e altura do retangulo: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rec.area());
		System.out.printf("PERIMETRO = %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.diagonal());
		
		sc.close();
	}
}