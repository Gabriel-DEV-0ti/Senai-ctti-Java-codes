package ternaria;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = sc.nextInt();
        System.out.println((num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero");

    }
}
