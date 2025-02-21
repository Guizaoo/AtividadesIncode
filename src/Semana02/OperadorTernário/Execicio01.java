package Semana02.OperadorTernário;
public class Execicio01 {
    public static void main(String[] args) {
        //Solicitar ao usuário sua idade e exibir "Você é maior de idade" se for maior ou igual a 18,
        // ou "Você é menor de idade" caso contrário, utilizando o operador ternário.

        //Ultilizando if e else

        int idadeIf = 18;

        if (idadeIf >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }

        System.out.println("---------------------------");

        //Estrutura de operador ternario
        //(condicao) ? verdadeiro : falso

        int idade = 18;
        String idadeCorreta = "Você é maior de idade";
        String idadeIncorreta = "Você é menor de idade";

        String resultado = idade > 12 ? idadeCorreta : idadeIncorreta;
        System.out.println(resultado);


    }
}
