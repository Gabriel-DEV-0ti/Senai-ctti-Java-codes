package ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Atv27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = sc.nextInt();

        System.out.println((num > 0) ? "Positivo" : (num == 0) ? "Zero" : "Negativo") ;
    }
}
