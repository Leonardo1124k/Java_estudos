import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		do {
		System.out.print("Qual numero da tabuada? ");
		num = sc.nextInt();
		if (num < 0) {
			break;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
			}
		System.out.println();
		} while(num >= 0);
		
		sc.close();
	}
}
