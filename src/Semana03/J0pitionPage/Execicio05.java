package Semana03.J0pitionPage;

import javax.swing.JOptionPane;

public class Execicio05 {
    public static void main(String[] args) {
        //Solicitar ao usuário uma temperatura em graus Celsius
        //e exibir a conversão para Fahrenheit utilizando JOptionPane.
      String numero = JOptionPane.showInputDialog("Informe um numero: ");

      int x = Integer.parseInt(numero);
      int quadrado = x * x;

      String resultadoQadrado = String.valueOf(quadrado);

      JOptionPane.showMessageDialog(null,"O quadrado de "+ numero + " é igual a " + resultadoQadrado);


    }
}
