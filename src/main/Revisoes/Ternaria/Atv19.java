package ternaria;

import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = div.nextInt();

        System.out.println((num % 2 == 0 || num % 3 == 0) ? num + " é divisível por 2 ou por 3" : num + " não é divisível por 2 e nem por 3");
    }
}
