package dev.java.introducao;

public class ThreeClass {
    public static void main(String[] args) {
        long numberLong = 1000000000L;
        // Casting = forçar um valor que não é válido
        int numberCasting = (int) 10000000000000000L;

        // Outro exemplo de casting

        int number = (int) 137.12D;

        double salary = 4000.9;
        float salaryFloat = 4000.1353f;
        byte ageByte = 127;
        short numberShort = 32767;
        boolean result = true;
        char ascii = '\u0041';

        System.out.println("I M P R I M I N D O...");
        System.out.println(number);

        // String
        String name = "Arthur Freitasss";
        System.out.println("What's up everyone, meu nome é: " + name);
    }
}
