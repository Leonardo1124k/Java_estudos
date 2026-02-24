package app;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Study{
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Digite o numero de empregados: ");
		int n  = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do empregado #" + (i+1) +": ");
			System.out.print("É terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Custo adicional: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee (name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		
	
		System.out.println("\nPagamentos: ");
		for (Employee emp: list) {
			System.out.println( emp.getName()+ " - R$" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}