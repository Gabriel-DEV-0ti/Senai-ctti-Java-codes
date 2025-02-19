package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Atv30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de duas notas: ");
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println();
        System.out.println((media >= 6) ? "Aprovado" : "Reprovado");
    }
}
