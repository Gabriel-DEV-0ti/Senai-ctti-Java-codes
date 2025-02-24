package ternaria;

import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite true ou false: ");
        boolean valor = sc.nextBoolean();
        String result = valor ? "sim" : "não";

        System.out.println("Resultado: " + result);

    }
}
