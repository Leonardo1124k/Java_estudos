import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_ALUNOS = 5;
        final int NUM_NOTAS = 3;
        final double MEDIA_APROVACAO = 6.0;

        String[] nomes = new String[NUM_ALUNOS];
        double[][] notas = new double[NUM_ALUNOS][NUM_NOTAS + 1]; // +1 para armazenar a média

        System.out.println("=== Cadastro de Alunos ===");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\n=== Cadastro de Notas ===");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            double soma = 0;
            System.out.println("Notas de " + nomes[i] + ":");
            for (int j = 0; j < NUM_NOTAS; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            notas[i][NUM_NOTAS] = soma / NUM_NOTAS; // calcula e armazena a média
        }

        // Cálculos gerais
        double somaGeral = 0;
        double somaAprovados = 0;
        int qtdAprovados = 0;

        for (int i = 0; i < NUM_ALUNOS; i++) {
            double media = notas[i][NUM_NOTAS];
            somaGeral += media;
            if (media >= MEDIA_APROVACAO) {
                somaAprovados += media;
                qtdAprovados++;
            }
        }

        // Exibição formatada dos resultados
        System.out.println("\n=== Resultados Finais ===");
        System.out.printf("%-15s %-8s %-8s %-8s %-8s %-10s%n",
                "Aluno", "Nota 1", "Nota 2", "Nota 3", "Média", "Situação");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < NUM_ALUNOS; i++) {
            double media = notas[i][NUM_NOTAS];
            String situacao = (media >= MEDIA_APROVACAO) ? "Aprovado" : "Reprovado";
            System.out.printf("%-15s %-8.2f %-8.2f %-8.2f %-8.2f %-10s%n",
                    nomes[i], notas[i][0], notas[i][1], notas[i][2], media, situacao);
        }

        // Médias gerais
        double mediaGeral = somaGeral / NUM_ALUNOS;
        double mediaAprovados = (qtdAprovados > 0) ? (somaAprovados / qtdAprovados) : 0;

        System.out.println("------------------------------------------------------------");
        System.out.printf("\nMédia geral da turma: %.2f%n", mediaGeral);
        System.out.printf("Média dos aprovados: %.2f%n", mediaAprovados);

        scanner.close();
    }
}
