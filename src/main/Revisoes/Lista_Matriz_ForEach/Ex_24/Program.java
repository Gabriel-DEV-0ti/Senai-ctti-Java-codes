package main.Revisoes.Lista_Matriz_ForEach.Ex_24;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] list = new int[10];
        Random rand = new Random();
        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }
        System.out.print("Lista dos pares: ");
        for(int i : list) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
