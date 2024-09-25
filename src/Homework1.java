public class Homework1 {
    public static void main(String[] args) {
        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436f;
        double f = 4.355453532;
        long g = 12121L;

        Character a1 = 'G';
        Integer b1 = 89;
        Byte c1 = 4;
        Short d1 = 56;
        Float e1 = 4.7333436f;
        Double f1 = 4.355453532;
        Long g1 = 12121L;

        System.out.println("char: " + a);
        System.out.println("int: " + b);
        System.out.println("byte: " + c);
        System.out.println("short: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("long: " + g);

        System.out.println("Character: " + a1);
        System.out.println("Integer: " + b1);
        System.out.println("Byte: " + c1);
        System.out.println("Short: " + d1);
        System.out.println("Float: " + e1);
        System.out.println("Double: " + f1);
        System.out.println("Long: " + g1);

        int num = 345;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;

        System.out.println( num + " -> " + hundreds + ", " + tens + ", " + units);
    }
}
