import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("==".repeat(20));
		System.out.println(" ".repeat(15) + "FATORAÇÃO");
		System.out.println("==".repeat(20));
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		int fat = 1;
		for (int i = n; i >= 1; i--) {
			if (i == 1) {
				System.out.printf("%d ", i);
			} else {
			System.out.printf("%d x " , i);
			fat = fat * i;
			}
		}
		System.out.print("= " + fat);
		
		sc.close();
	}
}
