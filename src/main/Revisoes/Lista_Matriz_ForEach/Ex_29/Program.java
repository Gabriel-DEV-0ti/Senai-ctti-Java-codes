package main.Revisoes.Lista_Matriz_ForEach.Ex_29;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[4][4];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("00");
                }
                else if(array[i][j] < 100) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print("  v   ");
        }
        System.out.println();
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int[] j : array) {
                sum += j[i];
            }
            System.out.print("[");
            if (sum < 10) {
                System.out.print("00");
            } else if (sum < 100) {
                System.out.print("0");
            }
            System.out.printf("%d] ", sum);
        }
    }
}
