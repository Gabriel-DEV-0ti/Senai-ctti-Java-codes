package ternaria;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = sc.nextInt();

        System.out.println((num > 0 && num % 2 == 0) ? "Par e Positivo" : (num < 0 && num % 2 == 0) ? "Par e Negativo" : (num > 0 && num % 2 != 0) ? "Ímpar e Positivo" : "Ímpar e Negativo");

    }
}
