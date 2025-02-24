package Semana02.EstruturasCondicionais;

import java.util.Scanner;

public class Execicio04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Senha certa
        String senhaCorreta = "guizao";

        // armazenamento
        String senhaInformada = "";

        // .equals comparacoes de strings
        while(!senhaInformada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaInformada = scanner.nextLine();

            if (!senhaInformada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Senha correta! Acesso concedido.");

        scanner.close();
    }
}