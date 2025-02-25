package ternaria;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inisra um valor: ");
        int valor = sc.nextInt();

        System.out.println((valor % 5 == 0) ? valor + " É múltiplo de 5" : valor + " Não é múltiplo de 5");
        sc.close();
    }
}
