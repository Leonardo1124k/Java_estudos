import java.util.Locale;
import java.util.Scanner;

public class Validacao_de_nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double pri = sc.nextDouble(); 
		while (pri < 0 || pri > 10) {
			System.out.print("Valor inválido! Digite novamente: ");
			pri = sc.nextDouble();
		}
		System.out.print("Digite a segunda nota: ");	
		double seg = sc.nextDouble();
		while (seg < 0 || seg > 10) {
			System.out.print("Valor inválido! Digite novamente: ");
			seg = sc.nextDouble();
		}
		double media = (pri + seg) / 2;
		System.out.printf("MEDIA = %.2f%n", media);
		sc.close();
	}

}
