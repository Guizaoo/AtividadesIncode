package Semana03.For;

import java.util.Scanner;

public class Execicio05 {
    public static void main(String[] args) {
        //Solicitar ao usuário um número e,
        // utilizando um laço for,
        // exibir todos os números pares de 0 até o número informado.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0);
            System.out.println("Interaçao dos numeros pares : "+  i);
        }
    }
}
