package main.Revisoes.Lista_Matriz_ForEach.Ex_22;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        System.out.print("Soma dos números inseridos: " + sum);
    }
}
