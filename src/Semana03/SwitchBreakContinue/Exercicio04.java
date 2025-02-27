package Semana03.SwitchBreakContinue;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pedido;

        System.out.println("Menu de Lanches");
        System.out.println("___________________");

        do {
            System.out.println("Escolha um prato:");
            System.out.println("1 - Pizza");
            System.out.println("2 - Hambúrguer");
            System.out.println("3 - Sushi");

            System.out.print("Digite sua opção: ");
            pedido = scanner.nextInt();

            switch (pedido) {
                case 1:
                    System.out.println("Seu pedido foi: Pizza");
                    break;
                case 2:
                    System.out.println("Seu pedido foi: Hambúrguer");
                    break;
                case 3:
                    System.out.println("Seu pedido foi: Sushi");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            //Logica que faz com que so encerre o programa caso for valida
        } while (pedido < 1 || pedido > 3);

        scanner.close();
    }
}
