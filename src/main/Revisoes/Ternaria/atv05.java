package ternaria;

import java.util.Scanner;

public class ATV05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um ano: ");
        int ano = sc.nextInt();

        System.out.println((ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) ? ano + " é bissexto" : ano + " não é bissexto");


    }
}
