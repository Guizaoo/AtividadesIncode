package Semana03.SwitchBreakContinue;

import java.util.Scanner;

public class Execicio01 {
    public static void main(String[] args) {
        //Solicitar ao usuário o número correspondente ao sinal de um semáforo (1 = vermelho, 2 = amarelo, 3 = verde) e,
        // com o uso de switch, exibir a cor do semáforo. Caso o número seja diferente de 1, 2 ou 3, exibir "Opção inválida".
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma das opiçoes (1/2/3) : ");
        int sinal = scanner.nextInt();

        switch (sinal){
            case 1:
                System.out.println("Semáforo vermelho");
                break;

                case 2:
                System.out.println("Semáforo amarelo");
                break;

                case 3:
                System.out.println("Semáforo verde");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
