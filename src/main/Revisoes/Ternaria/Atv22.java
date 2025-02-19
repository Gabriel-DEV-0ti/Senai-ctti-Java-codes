package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Atv22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de um produto: ");
        double produto = sc.nextDouble();

        System.out.println((produto >= 100) ? "Frete Grátis" : "Sem Frete Grátis");

    }
}
