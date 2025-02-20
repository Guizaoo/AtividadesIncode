package Semana01.OperadoresLogicos;

public class Execicio3 {
    public static void main(String[] args) {
        //Declarar uma variável boolean
        //acessoPermitido e atribuir (usuario.equals("admin") && senha.equals("1234")), exibindo o valor.

        String usuario = "admin";
        String senha = "1234";

        boolean acessoPermitido = (usuario.equals("admin") && senha.equals("1234"));
        System.out.println("acesso permitido: " + acessoPermitido);
    }
}
