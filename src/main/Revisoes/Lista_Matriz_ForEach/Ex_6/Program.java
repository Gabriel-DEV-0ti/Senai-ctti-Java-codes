package Lista_Matriz_ForEach.Ex_6;
//Crie uma lista com 10 números e remova todos os números ímpares dela.
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] list = new int[10];
        Random rand = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                list[i] = 0;
            }
        }

        System.out.print("Lista sem ímpares: ");
        for (int i : list) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
