package ternaria;

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println((num1 > num2) ? num1 + " é maior que " + num2 : (num2 > num1) ? num2 + " é maior que " + num1 : num1 + " e " + num2 + " são iguais");
    }
}
