package Lista_Matriz_ForEach.Ex_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Solicite 8 números ao usuário, armazene em uma lista e exiba os números ordenados em ordem crescente.
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 8 números: ");
        for (int i = 0; i < 8; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int num : numeros){
            System.out.println(num + " ");
        }
    }
}
