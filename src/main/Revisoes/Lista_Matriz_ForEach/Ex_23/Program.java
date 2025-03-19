package main.Revisoes.Lista_Matriz_ForEach.Ex_23;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        System.out.print("Insira o valor do número escalar: ");
        int mult = sc.nextInt();
        System.out.print("Lista escalada dos números inseridos: ");
        for(int i : list) {
            i *= mult;
            System.out.print(i + " ");
        }
    }
}
