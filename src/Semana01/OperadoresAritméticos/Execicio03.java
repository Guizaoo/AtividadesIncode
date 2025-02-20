package Semana01.OperadoresAritméticos;

import java.util.Scanner;

public class Execicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        // Calcula a expressão
        boolean resultado = (num % 2 == 0) && true;

        // Exibe o resultado e explica seu significado
        System.out.println("O resultado da expressão (num % 2 == 0) && true é: " + resultado);
        System.out.println("Isso significa que o número " + num + (resultado ? " é par." : " é ímpar."));

        scanner.close();
    }
}
