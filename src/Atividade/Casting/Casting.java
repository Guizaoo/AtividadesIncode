package Atividade.Casting;

public class Casting {
    public static void main(String[] args) {
        //- Declarar um double, converter para int explicitamente (casting) e exibir ambos os valores.
        //- Receber um número como String e converter para int usando Integer.parseInt().

        String s = "10";
        int numero = Integer.parseInt(s);
        System.out.println("Resultado da conversao de inteiro: "+ numero);

        double doubleTets = (double) 25.2;
        int inteiro = (int) doubleTets;
        System.out.println("Resultado da conversao de double: " + doubleTets);

    }
}
