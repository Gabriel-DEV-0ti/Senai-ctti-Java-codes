package ternaria;

import java.util.Scanner;

public class Atv26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();

        System.out.println((age >= 18) ? "Seu voto é obrigatório" : (age >= 16 && age <= 17) ? "Seu voto é opcional" : "Não pode votar");
    }
}
