import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int code = 0, alc = 0, gas = 0, die = 0 ;
		while (code != 4) {
			System.out.print("Informe um codigo (1,2,3) ou 4 para parar: ");
			code = sc.nextInt();
			if (code == 1) {
				alc += 1;
			}else if(code == 2) {
				gas += 1;
			}else if (code == 3) {
				die += 1;
			}
		}
		
		System.out.println("OBRIGADO !");
		System.out.println("ALCOOL: " + alc);
		System.out.println("GASOLINA: " + gas);
		System.out.println("DIESEL: " + die);
		sc.close();
		
		}
}
