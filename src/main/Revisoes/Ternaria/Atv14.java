package ternaria;

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num =  sc.nextInt();

        System.out.println((num >= 10 && num <= 50) ? num + " está dentro do intervalo entre 10 e 50" : num + " não está no intervalo entre 10 e 50");
    }
}
