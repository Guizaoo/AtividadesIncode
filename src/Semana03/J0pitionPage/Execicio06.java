package Semana03.J0pitionPage;

import javax.swing.JOptionPane;

public class Execicio06 {
    public static void main(String[] args) {
        //Comecando programa
        String idade = JOptionPane.showInputDialog("Digite seu nome:");

        //Logica para saber se ele maior ou menos
        try {
            int intIdade = Integer.parseInt(idade);

            if (intIdade >= 18) {
                JOptionPane.showMessageDialog(null,"Voce é maior de idade");
            }else {
                JOptionPane.showMessageDialog(null,"Você é menor de idade");
            }

        } catch (Exception e){
            //Vai ser executado quando tiver uma execao dentro do "try"
            //e.getMessage() erro que vem juntos caso seja desparad no "try"
            JOptionPane.showMessageDialog(null,"Erro ao converter numero: " + e.getMessage());
        }
    }
}
