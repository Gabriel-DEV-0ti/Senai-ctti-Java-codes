package main.Revisoes.Lista_Matriz_ForEach.Ex_10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] listaA = new int[5];
        int[] listaB = new int[5];
        int[] listaC = new int[listaA.length + listaB.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaA.length; i++){
            System.out.printf("Insira o valor nº %d da lista 1: ", i+1);
            listaA[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < listaB.length; i++){
            System.out.printf("Insira o valor nº %d da lista 2: ", i+1);
            listaB[i] = sc.nextInt();
        }
        for(int i = 0; i < listaC.length/2; i++) {
            listaC[i] = listaA[i];
            listaC[i+5] = listaB[i];
        }
        System.out.println("Junção das listas: ");
        for (int i : listaC){
            System.out.println(i + " ");
        }
    }
}
