import java.util.Scanner;

public class Par_impar {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vais digitar? ");
		int quant = sc.nextInt();
		int num;
		for (int i = 1; i <= quant; i++) {
			System.out.print("Digite um number: ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				if (num > 0) {
					System.out.println("Par positivo");
				}else if (num < 0){
					System.out.println("Par negativo");
				}else {
					System.out.println("NULO");
				}
			}
			else {
				if (num > 0) {
					System.out.println("Impar positivo");
				}else {
					System.out.println("Impar negativo");
				}
			}
		}
		sc.close();
	}
}
