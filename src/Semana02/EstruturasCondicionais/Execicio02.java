package Semana02.EstruturasCondicionais;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        //Criar um programa que solicita a nota do aluno e exibe a classificação:
        // "Aprovado" para nota >= 7, "Recuperação" para 5 <= nota < 7, e "Reprovado" para nota < 5.
        Scanner scanner = new Scanner(System.in);

        //Solicitando nota
        System.out.print("Digite sua nota: ");
        int nota = scanner.nextInt();

        scanner.close();

        //logica de nota
        if (nota >= 7){
            System.out.println("Você foi Aprovado");
        } else if(nota == 5 && nota <= 7){
            System.out.println("Você está de Recuperação");
        }else{
            System.out.println("Você está Reprovado");
        }
    }
}
