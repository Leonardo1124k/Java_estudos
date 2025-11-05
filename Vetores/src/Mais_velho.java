import java.util.Scanner;

public class Mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpa o buffer do Enter

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // limpa o buffer novamente
        }

        int maisVelho = idades[0];
        int posicaoMaisVelho = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                posicaoMaisVelho = i;
            }
        }

        System.out.printf("%nPessoa mais velha: %s%n", nomes[posicaoMaisVelho]);

        sc.close();
    }
}
