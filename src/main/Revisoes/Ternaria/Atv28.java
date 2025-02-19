package ternaria;

import java.util.Scanner;

public class Atv28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();

        System.out.println((num >= 20 && num <= 30) ? "O número está no intervalo entre 20 e 30" : "O número está fora do intervalo");
    }
}
