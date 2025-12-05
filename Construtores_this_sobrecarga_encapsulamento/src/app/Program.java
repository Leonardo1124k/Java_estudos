package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rules;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Rules rul;
		
		System.out.print("Digite seu numero de conta: ");
		int account = sc.nextInt();
		System.out.print("Digite o responsavel da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Vai digitar algum deposito inicial (s/n)? ");
		char question = sc.next().charAt(0);
		if (question == 's') {
			System.out.print("Digite o deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			rul = new Rules(account, holder, initialDeposit);
		}else {
			rul = new Rules(account, holder);
		}
		
		System.out.println("\nDados da conta: ");
		System.out.println(rul);
		
		System.out.println("Digite um valor de deposito: ");
		double amount = sc.nextDouble();
		rul.deposit(amount);
		System.out.println("Conta atualizada: ");
		System.out.println(rul);
		
		System.out.println("Digite um valor para retirar: ");
		double left = sc.nextDouble();
		rul.withdraw(left);
		System.out.println("Conta atualizada: ");
		System.out.println(rul);
		
		
		
		
		sc.close();
	}
}
