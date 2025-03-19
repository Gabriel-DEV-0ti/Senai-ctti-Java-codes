package main.Revisoes.Lista_Matriz_ForEach.Ex_18;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[4][4];
        int med = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                med += array[i][j];
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
        med /= 16;
        System.out.println("Média dos números gerados na matriz: " + med);
    }
}
