package Semana03.For;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        //- Solicitar ao usuário um número e exibir a tabuada desse número (de 1 a 10) utilizando um laço `for`.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Interação: "+ (numero * i));
        }
    }
}
