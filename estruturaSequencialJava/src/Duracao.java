import java.util.Scanner;

public class Duracao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==".repeat(20));
		System.out.println(" ".repeat(10) +"Contador de segundos");
		System.out.println("==".repeat(20));
		
		System.out.print("Digite a duração pretendida em segundos: ");
		int segundos = sc.nextInt();
		
		int seg = segundos % 60;
		int min = segundos / 60 % 60;
		int horas = segundos / 60 / 60;
		
		System.out.printf("\nTempo -> %d:%d:%d", horas,min,seg);
		
		sc.close();
	}
}
