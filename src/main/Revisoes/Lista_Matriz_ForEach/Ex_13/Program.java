package main.Revisoes.Lista_Matriz_ForEach.Ex_13;

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
        int max = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maior número da matriz: " + max);
    }
}
