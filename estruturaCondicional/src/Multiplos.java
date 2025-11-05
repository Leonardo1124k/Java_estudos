import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite dois numeros inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.printf("%d e %d são multiplos entre si!", x, y);
		}
		else {
			System.out.printf("%d e %d NÃO são multiplos entre si.", x, y);
		}
			
		sc.close();
	}
}
