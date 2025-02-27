package Semana03.SwitchBreakContinue;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Exibir \"Ação 1\"");
            System.out.println("2. Exibir \"Ação 2\"");
            System.out.println("3. Exibir \"Ação 3\"");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            // Lógica das opicoes
            switch (opcao) {
                case 1:
                    System.out.println("Ação 1");
                    break;
                case 2:
                    System.out.println("Ação 2");
                    break;
                case 3:
                    System.out.println("Ação 3");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 41);

        scanner.close();
    }
}
