import java.util.Scanner;
import java.util.Locale;

public class Pagamento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorh = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		
		double pay = valorh * horas;
		
		System.out.printf("O pagamento para %s deve ser R$%.2f", nome, pay);
		
		sc.close();
	}
}
