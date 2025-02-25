package ternaria;

import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores: ");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        System.out.println((valor1 > valor2) ? valor1 + " é maior que " + valor2 : valor1 + " é menor que " + valor2);
    }
}
