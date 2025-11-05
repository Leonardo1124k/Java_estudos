import java.util.Scanner;
/*import java.util.Locale;*/

public class Consumo {
	public static void main(String[] args) {
		/*Locale.setDefault(Locale.US);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("==".repeat(20));
		System.out.println(" ".repeat(8) + "Economizador de Gasolina");
		System.out.println("==".repeat(20));
		System.out.print("Digite a distância percorrida (km): ");
		int dist = sc.nextInt();
		System.out.print("Digite o valor gasto em combustivel (l): ");
		double valor = sc.nextDouble();
		
		double media = dist/valor; 
		
		System.out.printf("Consumo medio de 1 litro de gasolina por %.3fkm", media);
		sc.close();
	}

}
