package app;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import rules.Employee;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados? ");
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
			System.out.println("\nFuncionario "+ (i+1) + ":");
			System.out.print("Id: ");
			
			int id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.print("Id já registrado. Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Employee (id,name,salary));
		}
		
		System.out.print("\nDigite o Id do empregado que terá aumento: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse id não existe!!!");
		}else {
			System.out.print("Digite o percentual de aumento: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("\nLista de empregados: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}