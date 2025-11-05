import java.util.Scanner;

public class Soma_matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int m = sc.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz? ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        System.out.println("\nDigite os valores da matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDigite os valores da matriz B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                B[i][j] = sc.nextInt();
            }
        }

        // Soma das matrizes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Impressão da matriz C
        System.out.println("\nMATRIZ SOMA:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
