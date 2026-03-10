package app;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite os dados da conta bancária");
			System.out.print("Número: ");
			int number = sc.nextInt();
			System.out.print("Dono da conta: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Valor inicial na conta: ");
			double amount = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, withdrawLimit);
			account.deposit(amount);
			
			System.out.print("\nDigite o valor desejado para sacar: ");
		    amount = sc.nextDouble();
		    account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());

		}catch(AccountException e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro inesperado.");
		}
		
	}

}
