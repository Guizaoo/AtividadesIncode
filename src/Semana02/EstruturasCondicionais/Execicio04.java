package Semana02.EstruturasCondicionais;

import java.util.Scanner;

public class Execicio04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 5; //
        boolean loginSucesso = false;

        String usuarioCorreto = "Guilherme";
        String senhaCorreta = "guizu123";

        while (tentativas > 0 && !loginSucesso) {
            System.out.print("Digite seu usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                loginSucesso = true;
                System.out.println("Login realizado com sucesso!");
            } else {
                tentativas--;
                System.out.println("Usuário ou senha incorretos! Tentativas restantes: " + tentativas);
            }
        }

        if (!loginSucesso) {
            System.out.println("Voce tentou varias vezes. Conta bloqueada!");
        }

        scanner.close();
    }
}