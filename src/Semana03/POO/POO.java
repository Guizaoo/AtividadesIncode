package Semana03.POO;

import Semana03.Classes.Cliente;

public class POO {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c1.nome = "junin";
        c1.email = "junin@gmail.com";
        c1.telefone = "09213912";

        c2.nome = "juliana";
        c2.email = "juliana@gmail.com";
        c2.telefone = "012123213912";



        c1.imprimir();
        System.out.println("-------------");
        c2.imprimir();

//        System.out.println("nome:" +c1.nome+ " email:" + c1.email+" telefone:" + c1.telefone);

    }
}
