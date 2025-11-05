import java.util.Scanner;
import java.util.Locale;

public class Aumento {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite o nome do funcionario: ");
		String nome = sc.nextLine();
		System.out.printf("Digite o salário de %s: R$", nome);
		double sal = sc.nextDouble();
		double porcen = 0;
		
		if (sal < 1000) {
			porcen = 20;
		}else if (sal < 3000) {
			porcen = 15;
		}else if (sal < 8000) {
			porcen = 10;
		}else {
			porcen = 5;
		}
		
		double newsal = sal + (sal * porcen/100);
		
		System.out.printf("\nNovo salario de %s: R$%.2f%n", nome,newsal);
		System.out.printf("Aumento = R$%.2f%n", newsal-sal);
		System.out.printf("Porcentagem = %.0f%%%n", porcen);
		sc.close();
	}
}
