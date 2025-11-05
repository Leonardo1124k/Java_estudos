import java.util.Scanner;

public class Varios_numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num, soma = 0, quant = 0;
		do{
			System.out.print("Digite um numero (999 - para): ");
			num = sc.nextInt();
			soma = soma + num;
			quant += 1;
		} while(num != 999);
		
		System.out.printf("Foram digitados %d numeros", quant - 1);
		System.out.printf("\nSOMA TOTAL = %d", soma - 999);
		
		sc.close();
	}
}
