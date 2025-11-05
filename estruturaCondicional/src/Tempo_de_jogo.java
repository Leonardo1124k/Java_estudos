import java.util.Scanner;

public class Tempo_de_jogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Hora inicial do jogo: ");
		int ini = sc.nextInt();
		System.out.print("Hora final: ");
		int fin = sc.nextInt();
		int horas;
		
		if (ini < fin) {
			horas = fin - ini;
		} else {
			horas = 24 - ini + fin;
		}
		
		System.out.printf("\nO jogo durou %d hora(s)", horas);
		sc.close();
	}
}
