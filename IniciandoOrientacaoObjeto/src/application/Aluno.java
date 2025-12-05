package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student alun = new Student();
		System.out.print("Nome: ");
		alun.name = sc.nextLine();
		System.out.print("Nota 1: ");
		alun.grade1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		alun.grade2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		alun.grade3 = sc.nextDouble();
		
		System.out.printf("\nNota final: %.2f%n", alun.gradesSum());
		
		if (alun.approval() == 0) {
			System.out.println("Aprovado");
		}else {
			System.out.printf("REPROVADO\nFaltaram %.2f pontos para passar", alun.approval());
		}
		
		sc.close();
	}
}
