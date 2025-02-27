package Semana03.For;

import javax.swing.*;
import java.util.Scanner;

public class Execicio01 {
    public static void main(String[] args) {
        //Solicitar ao usuário um número e exibir todos
        // os números de 1 até o número informado utilizando um laço for.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        for (int i = 0; i <= numero; i++) {
            System.out.println("interacao: " + i);
        }
    }
}
