import java.util.Scanner;

public class Pares_consecutivos {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma;
		while (true) {
			System.out.print("Digite um numero inteiro (0 - para): ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num % 2 == 0) {
				soma = 5 * num + 2 + 4 + 6 + 8;
			}else {
				soma = 5 * (num+1) + 2 + 4 + 6 + 8;
			}
			System.out.println("SOMA = " + soma);
		}
		sc.close();
	}
}
