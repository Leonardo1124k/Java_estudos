import java.util.Scanner;

public class Experiencias {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos casos de teste digitarás? ");
		int casos = sc.nextInt();
		int quant, total = 0, totcoelhos = 0, totratos = 0, totsapos = 0;
		double percentc = 0, percentr = 0, percents = 0;
		char tipo;
		for (int i = 1; i <= casos; i ++) {
			System.out.print("Quant. cobaias: ");
			quant = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			// Calculos aqui
			total += quant;
			if (tipo == 'C') {
				totcoelhos += quant;
			}else if (tipo == 'R') {
				totratos += quant;
			}else if(tipo == 'S') {
				totsapos += quant;
			}
		}
		
		//Porcentagens
		percentc = (double) totcoelhos/ total * 100;
		percentr = (double) totratos / total * 100;
		percents = (double) totsapos / total * 100;
		
		System.out.println("\n== RELATÓRIO ==");
		System.out.println("Total de cobaias: "+ total);
		System.out.println("Total de COELHOS: " + totcoelhos);
		System.out.println("Total de RATOS: " + totratos);
		System.out.println("Total de SAPOS: " + totsapos);
		System.out.printf("Percentual de coelhos: %.2f%n", percentc);
		System.out.printf("Percentual de ratos: %.2f%n", percentr);
		System.out.printf("Percentual de sapos: %.2f%n", percents);
		
		sc.close();
	}
}
