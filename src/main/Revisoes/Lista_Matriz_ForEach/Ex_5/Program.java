package Lista_Matriz_ForEach.Ex_5;
//Permita que o usuário informe um número e verifique se ele está presente na lista previamente preenchida.
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] list = new int[10];
        boolean is = false;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.length; i++){
            list[1] = rand.nextInt();
            list[1] += 1;
        }

        System.out.println("Insira o número a ser pesquisado: ");
        int search = sc.nextInt();
        for (int i : list){
            if (i == search){
                is = true;
                i = list.length;
            }
        }

        System.out.print("O número " + search);
        if (!is){
            System.out.print(" não");
        }
        System.out.print(" está presente na lista.");
    }
}
