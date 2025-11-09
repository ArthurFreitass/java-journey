package dev.java.introducao;

public class FourClassExercise {
    public static void main(String[] args) {
        /*Prática:

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salario>, na data <data>*/

        String name = "Duke";
        String addressUser = "Brazil (55), MG - Belo Horizonte";
        double salaryUser = 2459.34;
        String salaryDate = "09/11/2025";

        String message = ("Eu "+ name + ", morando no endereço "+ addressUser + ", confirmo que recebi o salário de R$ "+ salaryUser+ ", na data "+ salaryDate);
        System.out.println(message);
    }
}
