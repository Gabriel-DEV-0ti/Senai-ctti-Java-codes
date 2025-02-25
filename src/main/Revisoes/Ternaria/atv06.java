package ternaria;

import java.util.Scanner;

public class atv06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int age = sc.nextInt();

        System.out.println((age >= 18) ? "Pode dirigir" : "Não pode dirigir");
    }
}
