package ternaria;

import java.util.Scanner;

public class atv08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma nota: ");
        int nota = sc.nextInt();

        System.out.println((nota >= 7) ? "Aprovado" : "Reprovado");
    }
}
