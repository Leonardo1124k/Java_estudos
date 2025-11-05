import java.util.Scanner;
import java.util.Locale;

public class Lanchonete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Codigo do produto comprado: ");
		int code = sc.nextInt(); 
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		double preco = 0;
		
//		if (code == 1) {
//			preco = 5.00;
//		}else if (code == 2) {
//			preco = 3.50;
//		}else if (code == 3) {
//			preco = 4.80;
//		}else if (code == 4) {
//			preco = 8.90;
//		}else if (code == 5) {
//			preco = 7.32;
//		}else {
//			System.out.println("Codigo invalido! Tente novamente...");
//		}
		switch(code) {
		case 1:
			preco = 5.0;
			break;
		case 2:
			preco = 3.5;
			break;
		case 3:
			preco = 4.8;
			break;
		case 4:
			preco = 8.9;
			break;
		case 5:
			preco = 7.32;
			break;
		default:
			System.out.println("Codigo invalido! Tente novamente...");
			break;
		}
		
		double pagar = quant * preco ;
		
		System.out.printf("Valor a pagar: R$%.2f%n", pagar);
		sc.close();
	}
}
