import java.util.Scanner;
import java.util.Locale;

public class Coordenadas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double x;
		double y;
		char resp;
//		while (true) {
//			System.out.print("Valor de X: ");
//			x = sc.nextDouble();
//			System.out.print("Valor de Y: ");
//			y = sc.nextDouble();
//			if (x > 0 && y > 0) {
//				System.out.println("Quadrante 1");
//			} else if(x > 0 && y < 0) {
//				System.out.println("Quadrante 4");
//			} else if (x < 0 && y > 0) {
//				System.out.println("Quadrante 2");
//			} else if (x < 0 && y < 0) {
//				System.out.println("Quadrante 3");
//			}else if(x != 0 && y == 0) {
//				System.out.println("Eixo X");
//			}else if(x == 0 && y != 0) {
//				System.out.println("Eixo Y");
//			}else {
//				System.out.println("Origem");
//			}
//		System.out.print("Quer continuar (S/N)? ");
//		resp = sc.next().charAt(0);
//		if (resp == 'N') {
//			break;
//		}
//		}
		do {
			System.out.print("Valor de X: ");
			x = sc.nextDouble();
			System.out.print("Valor de Y: ");
			y = sc.nextDouble();
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			} else if(x > 0 && y < 0) {
				System.out.println("Quadrante 4");
			} else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			} else if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");
			}else if(x != 0 && y == 0) {
				System.out.println("Eixo X");
			}else if(x == 0 && y != 0) {
				System.out.println("Eixo Y");
			}else {
				System.out.println("Origem");
			}
		System.out.print("Quer continuar (S/N)? ");
		resp = sc.next().charAt(0);
		}
		while (resp != 'N');
		
		sc.close();
	}
}
