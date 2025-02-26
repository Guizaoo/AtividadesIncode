package Semana03.J0pitionPage;

import javax.swing.*;
import java.util.EventListener;

public class Execicio01 {
    public static void main(String[] args) {
        //Exibição
        JOptionPane.showMessageDialog(null, "Programa iniciado");

        //Digitar
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null,"Ola " + nome);

        //0 - O Usuario clicou em "sim"
        //1 - O Usuario clicou em "nao"
        //2 - O Usuario clicou em "cancelar"
       int resposta = JOptionPane.showConfirmDialog(null, "Escola uma das opições: ");

       if (resposta == 0){
           JOptionPane.showConfirmDialog(null, "voce clicou em SIM");

       }else if(resposta == 1){
           JOptionPane.showConfirmDialog(null, "voce clicou em NAO");

       }else {
           JOptionPane.showConfirmDialog(null, "voce clicou em CANCELAR");
       }
    }
}
