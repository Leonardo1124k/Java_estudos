import java.util.Scanner;
import java.util.Locale;

public class Medidas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double quad = a * a;
		double tri = b * a / 2;
		double trap = (a + b) * c / 2;
		
		System.out.printf("\nArea do quadrado: %.4f", quad);
		System.out.printf("\nArea do triangulo: %.4f", tri);
		System.out.printf("\nArea do trapezio: %.4f", trap);
		
		sc.close();
	}
}
