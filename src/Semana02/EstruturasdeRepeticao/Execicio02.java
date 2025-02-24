package Semana02.EstruturasdeRepeticao;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        //Criar um programa que solicita ao
        //usuário um número e imprime a soma de todos os números inteiros até o valor informado.
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero: ");
        int numero = scanner.nextInt();


        scanner.close();

        while (numero <= 50){
            System.out.println(numero);
            numero++;
        }

    }
}
