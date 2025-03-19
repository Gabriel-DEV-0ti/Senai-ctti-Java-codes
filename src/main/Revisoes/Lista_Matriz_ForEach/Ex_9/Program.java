package main.Revisoes.Lista_Matriz_ForEach.Ex_9;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] list = new String[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++){
            System.out.printf("Insira o nome nº %d: ", i+1);
            list[i] = sc.nextLine();
        }
        System.out.print("Lista inversa dos nomes inseridos:\n");
        for(int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
