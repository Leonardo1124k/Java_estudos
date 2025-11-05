import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 1;
		int y = 1;
		
		while (x != 0 && y != 0) {
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			}else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}else if (x > 0 && y < 0) {
				System.out.println("Quadrante 4");
			}else if(x < 0 && y < 0) {
				System.out.println("Quadrante 3");
			}
			
		}
		
		sc.close();
	}
}
