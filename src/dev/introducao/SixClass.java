package dev.introducao;

public class SixClass {
    public static void main(String[] args) {
        // Operadores lógicos

        String frase = "I'm the one";

        // Testando o operador AND
        System.out.println(frase != "Eu sou o único" && frase != "Programação >>> All");
        System.out.println();
        System.out.println(frase != "Eu sou o único" && frase != frase);

        // Testando o operador OR
        System.out.println(frase != "Eu sou o único" || frase != "Programação >>> All");
        System.out.println();
        System.out.println(frase == "Eu sou o único" || frase != frase);
    }
}
