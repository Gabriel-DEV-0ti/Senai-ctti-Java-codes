package ternaria;

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "Par" : "Impar");
        sc.close();
    }
}
