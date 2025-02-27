package Semana03.For;

import java.util.Scanner;

public class Execicio04 {
    public static void main(String[] args) {
        //Solicitar ao usuário um número n e imprimir uma
        // sequência onde o primeiro número seja 1,
        // o segundo 3, o terceiro 5, e assim por diante, até o nésimo valor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int num = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < num; i++) {
            System.out.println(2 * i + 1);
        }
    }
}
