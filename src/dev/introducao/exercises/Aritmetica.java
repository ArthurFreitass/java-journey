package dev.introducao.exercises;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {

        /**
         * Crie um programa que receba dois números inteiros e mostre a soma, subtração, multiplicação, divisão e resto da divisão entre eles.
         */

        // Criando o Scanner para receber valor
        Scanner sc = new Scanner(System.in);

        System.out.println("C A L C U L A D O R A");
        System.out.println("=====================");

        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();

        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        sc.close();

        double sum = num1 + num2;
        double mult = num1 * num2;
        double div = (double) num1 / (double) num2;
        double sub = num1 - num2;
        double mod = num1 % num2;

        System.out.println("\n\nR E S U L T A D O S\n");
        System.out.println("A soma é: "+ sum);
        System.out.println("A subtração é: "+ sub);
        System.out.println("A multiplicação é: "+ mult);
        System.out.println("A divisão é: "+ div);
        System.out.println("O resto da divisão é: "+ mod);
    }
}
