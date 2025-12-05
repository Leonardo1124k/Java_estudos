package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Funcionario{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee colab = new Employee(); 
		System.out.print("Digite seu nome:");
		colab.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		colab.grossSalary = sc.nextDouble();
		System.out.print("Impostos a pagar: ");
		colab.tax = sc.nextDouble();
		
		System.out.println("\nFuncionario: " + colab);
		
		System.out.print("Quantos porcento aumentar o salario? ");
		double percentage = sc.nextDouble();
		colab.increaseSalary(percentage);
		
		System.out.println("\nSalario aumentado: " + colab);
		
		sc.close();
	}
}