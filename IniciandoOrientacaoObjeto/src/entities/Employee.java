package entities;

public class Employee{
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	//Esse metodo vai informar o salario liquido tanto sem aumento como com aumento...
	public double netSalary() {
		double net = grossSalary - tax;
		return net;
	}
	
	public void increaseSalary(double perc) {
		grossSalary = grossSalary * (1 + perc/100);
	}
	
	//pega esse automaticamente
	public String toString() {
		return
		name + ", R$" + String.format("%.2f%n", netSalary());
	}
}