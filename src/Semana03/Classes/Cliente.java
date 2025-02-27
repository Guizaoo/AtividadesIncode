package Semana03.Classes;

public class Cliente {

    public String nome;
    public String email;
    public String telefone;

    public void imprimir(){
        System.out.println("FICHA DO CLIENTE");
        System.out.println("NOME: " + this.nome);
        System.out.println("EMAIL: "+ this.email);
        System.out.println("TELEFONE: "+ this.telefone);
    }

}
