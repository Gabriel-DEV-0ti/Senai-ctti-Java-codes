package main.Revisoes.Lista_Matriz_ForEach.Ex_25;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] list = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o nome nº %d: ", i+1);
            list[i] = sc.nextLine();
        }
        for(String name : list) {
            System.out.println("Olá, " + name + "!");
        }
    }
}
