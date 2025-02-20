package Semana01.Wrappers;

public class Wrappers {
    public static void main(String[] args) {
        byte byteP = 1 ;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        char charP = 'M';
        boolean booleanP = true;

        Byte byteW = 1 ;
        Short shortW = 1;
//        Integer intW = 10;
        Long longW = 10l;
        Float floatW = 10F;
        Character charW = 'M';
        Boolean booleanW = true;




        Integer intW = 10;
        int i = intW.intValue();


        Double doubleW = 10D;
        double d = doubleW.doubleValue();

        System.out.println("Conversao de Wrappers para inteiro : " + doubleW);
        System.out.println("Valor do int: " + i);
    }
}
