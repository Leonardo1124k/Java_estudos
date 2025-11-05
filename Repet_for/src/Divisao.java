import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos casos voce vai digitar? ");
		int quant = sc.nextInt();
		int num, den;
		double div;
		for (int i = 1; i <= quant; i++) {
			System.out.print("Entre com o numerador: ");
			num = sc.nextInt();
			System.out.print("Denominador: ");
			den = sc.nextInt();
			
			if (den == 0) {
				System.out.println("Divisão impossível!!!");
			}else {
				div = (double) num / den;
				System.out.printf("DIVISÃO = %.2f%n", div);
			}
		}
		
		sc.close();
	}
}
