package ternaria;

import java.util.Scanner;

public class Atv25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número que represente os dias da semana: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");

       int day = sc.nextInt();

        System.out.println((day >= 2 && day <= 6) ? "Dia Útil" : (day == 1 || day == 7) ? "Fim de Semana" : "Inválido");

    }
}
