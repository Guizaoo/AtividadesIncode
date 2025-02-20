package Semana02.OperadoresdeAtribuicao;
import  java.util.Scanner;
public class Execicio03 {
    public static void main(String[] args) {
        //Solicitar ao usuário dois números e exibir o maior entre eles.
            Scanner scanner = new Scanner(System.in);

        //Pedindo Primeiro Numero
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        //Pedindo Segundo Numero
        System.out.println("Digite o segundo nuemero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        //Logica para saber qual o maior entre eles.
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
