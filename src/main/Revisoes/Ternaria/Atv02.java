package ternaria;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();

        System.out.print((age >= 18) ? "Maior de Idade" : "Menor de Idade");
        sc.close();
    }
}
