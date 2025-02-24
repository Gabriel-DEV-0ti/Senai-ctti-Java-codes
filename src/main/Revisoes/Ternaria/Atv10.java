package ternaria;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = sc.nextInt();

        System.out.println((num >= 100) ? "Alto" : "Baixo");
    }
}
