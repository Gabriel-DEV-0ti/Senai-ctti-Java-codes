package main.Revisoes.Lista_Matriz_ForEach.Ex_26;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        for(int[] i : array) {
            for(int j : i) {
                System.out.print("[");
                if(j < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", j);
            }
            System.out.println();
        }
    }
}
