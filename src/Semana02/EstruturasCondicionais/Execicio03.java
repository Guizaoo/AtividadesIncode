package Semana02.EstruturasCondicionais;

import java.util.Scanner;

public class Execicio03 {
    public static void main(String[] args) {
        //Perguntar ao usuário se ele tem mais de 18 anos
        //e se é estudante para determinar se ele tem direito a desconto (pode ser utilizando && no if).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ele é estudante: ");
        String Estudante = scanner.nextLine();

        scanner.close();


        //Logica de idade e desconto
        if (idade >= 18 && Estudante.equalsIgnoreCase("sim")){
            System.out.println("Ele tem 18 anos e é estudante, entao recebe desconto");

        }else if (idade <= 18 && Estudante.equalsIgnoreCase("nao")){
            System.out.println("Ele nao tem 18 anos e nao é estudante, entao nao recebe desconto");

        }else{
            System.out.println("xxxxxxxx");
        }
    }
}
