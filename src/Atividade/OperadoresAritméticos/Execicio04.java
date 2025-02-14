package Atividade.OperadoresAritméticos;

import java.util.Scanner;

public class Execicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita a temperatura em celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // converte para Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        //resultado
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
