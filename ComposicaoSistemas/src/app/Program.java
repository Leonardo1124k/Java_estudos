package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o seu departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Digite os dados do trabalhador:");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Nivel de cargo: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario base: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("Quantos contratos serão feitos para este colaborador ? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do #" + i + " contrato:");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Digite algum mes e ano para conferir qual será o salario total (MM/AAAA): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Renda total em " + monthAndYear + ": R$" + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}