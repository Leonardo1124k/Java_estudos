import java.util.Scanner;
import java.util.Locale;

public class Estudo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros vais digitar? ");
		int n = sc.nextInt();
		double[] vet = new double [n];
		
		for (int i=0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("\nNumeros digitados: ");
		for (int i = 0; i < n; i ++) {
			System.out.print(i + "° numero: ");
			System.out.printf("%.2f%n", vet[i]);
		}
		
		sc.close();
	}
}
