package dev.introducao;

public class FourClass {
    public static void main(String[] args) {
        /**
         * Operadores aritméticos
         */
        int num1 = 50;
        int num2 = 20;
        String outgoinMessage;
        // Soma

        double resultSum = num1 + num2;
        // Multiplicação

        double resultMult = num1 * num2;

        // Divisão
        double resultDiv = num1 / num2;

        // Subtração

        double resultSub = num1 - num2;

        // Módulo

        double resultMod = num1 % num2;

        // Saída

        outgoinMessage = " CALCULANDO \n" +
                "Soma: "+ resultSum+ "\n" +
                "Subtração: "+ resultSub + "\n" +
                "Multiplicação: " + "\n" +
                "Divisão: "+ resultDiv + "\n" +
                "Módulo: "+ resultMod;

        System.out.println(outgoinMessage);
        System.out.println("Resultado: "+ (20 + 30));

    }
}
