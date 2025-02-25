package ternaria;

import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();

        System.out.println((num % 3 == 0 && num % 5 == 0) ? "FizzBuzz" : num);
    }
}
