import java.util.Scanner;

public class Senha_fixa {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		int senhaCerta = 2703; 
		while(senha != senhaCerta) {
			System.out.print("Senha invalida! Try again: ");
			senha = sc.nextInt();
		}
		
		System.out.println("\nAcesso permitido!");
		sc.close();
	}
}
