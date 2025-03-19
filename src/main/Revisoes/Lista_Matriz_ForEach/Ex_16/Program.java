package main.Revisoes.Lista_Matriz_ForEach.Ex_16;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho da matriz: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
            }
        }
        System.out.println("Matriz dos números gerados: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
    }
}
