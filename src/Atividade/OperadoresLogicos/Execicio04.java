package Atividade.OperadoresLogicos;

public class Execicio04 {
    public static void main(String[] args) {
        //guilhere
        //Declarar três variáveis boolean para verificar
        // se um número é positivo (num > 0), negativo (num < 0) ou zero (num == 0), exibindo os valores.
        int num1 = 10;
        int num2 =  -1;
        int num3 = 0;

        boolean valores = (num1 > 0);
        boolean valores1 = (num2 > 0);
        boolean valores2 = (num1 == 0);

        System.out.println("Positivo :" + valores);
        System.out.println("Negativo :" + valores1 );
        System.out.println("Igual :" + valores2);
    }
}
