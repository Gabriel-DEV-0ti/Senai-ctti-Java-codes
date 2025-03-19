package main.Revisoes.Lista_Matriz_ForEach.Ex_14;

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
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Soma da diagonal principal da matriz: " + sum);
    }
}
