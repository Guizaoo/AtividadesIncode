package Semana02.OperadoresdeAtribuicao;

public class Execicio01 {
    public static void main(String[] args) {
        //- Verificar se dois números são iguais.
        int num1 = 12;
        int num2 = 10;

        if (num1 == num2) {
            System.out.println("Numeros iguais");
        } else if (num1 >= num2) {
            System.out.println("Numero 1 maior que numero 2");
        } else if (num1 <= num2) {
            System.out.println("Numero 2 maior que numero 1");
        } else {
            System.out.println("Numeros não são iguais");
        }
    }
}
