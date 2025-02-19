package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma nota: ");
        double nota = sc.nextDouble();

        System.out.println((nota >= 7) ? "Aprovado" : (nota >= 5 && nota <= 6.9) ? "Recuperação" : "Reprovado");

    }
}
