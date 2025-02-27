package Semana03.For;

import java.util.Scanner;

public class Execicio03 {
    public static void main(String[] args) {
        //Solicitar ao usuário um número e,
        //em seguida, solicitar até esse número e exibir
        //a soma de todos os números inteiros de 1 até o valor informado.
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o numero: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < numero; i++) {
            soma += i;
        }
        System.out.println("A soma dos numeros de 1 ate " + numero + " é: " + soma);
        }
    }

