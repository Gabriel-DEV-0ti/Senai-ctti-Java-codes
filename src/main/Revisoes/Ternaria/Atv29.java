package ternaria;

import java.util.Scanner;

public class Atv29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();

        System.out.println((age >= 18 && age <= 60) ? "Adulto" : (age > 60) ? "Idoso" : "Jovem");
    }
}
