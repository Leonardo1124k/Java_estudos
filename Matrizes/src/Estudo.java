import java.util.Scanner;

public class Estudo{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas linhas terá a matriz? ");
		int l = sc.nextInt();
		System.out.print("Quantas colunas terá a matriz? ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz digitada: ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
