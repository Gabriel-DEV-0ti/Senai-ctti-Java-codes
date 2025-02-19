package ternaria;

import java.util.Scanner;

public class Atv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0 && num >= 0) ? "Par e Positivo" : (num % 2 != 0 && num >= 0) ? "Ímpar e Positivo" : (num < 0 && num % 2 == 0) ? "Par e Negativo" : "Ímpar e Negativo");
    }
}
