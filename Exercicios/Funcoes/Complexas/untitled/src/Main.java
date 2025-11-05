import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_PRODUTOS = 5;
        final int COLUNAS = 3; // [0] valor unitário, [1] quantidade, [2] total de vendas

        String[] produtos = {"Lixa fina", "Martelo", "Cimento", "Capa de Chuva", "Botina"};
        double[][] dados = new double[NUM_PRODUTOS][COLUNAS];

        System.out.println("=== Cadastro de Produtos ===");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.printf("\nProduto: %s%n", produtos[i]);

            System.out.print("Valor unitário: ");
            dados[i][0] = scanner.nextDouble();

            System.out.print("Quantidade vendida: ");
            dados[i][1] = scanner.nextDouble();

            dados[i][2] = dados[i][0] * dados[i][1]; // total de vendas
        }

        double totalGeralVendas = 0;
        double totalItensVendidos = 0;

        System.out.println("\n=== Relatório de Vendas ===");
        System.out.printf("%-20s %-12s %-12s %-12s%n", "Descrição do Produto", "Vlr. Unit.", "Qtde.", "Total");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < NUM_PRODUTOS; i++) {
            totalGeralVendas += dados[i][2];
            totalItensVendidos += dados[i][1];

            System.out.printf("%-20s R$ %-10.2f %-12.0f R$ %-10.2f%n",
                    produtos[i], dados[i][0], dados[i][1], dados[i][2]);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total de Itens Vendidos: %.0f%n", totalItensVendidos);
        System.out.printf("Total Geral de Vendas: R$ %.2f%n", totalGeralVendas);

        scanner.close();
    }
}
