package Semana03.SwitchBreakContinue;

import java.util.Scanner;

public class Execicio03 {
    public static void main(String[] args) {
        //Solicitar ao usuário um número e,
        // utilizando um laço for e continue,
        // exibir apenas os números ímpares de 1 até o número informado.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        //logica
        System.out.println("Números ímpares de 1 ate " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
