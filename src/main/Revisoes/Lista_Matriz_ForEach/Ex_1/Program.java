package Lista_Matriz_ForEach.Ex_1;
//Crie um programa que solicite 5 números ao usuário e os armazene em uma lista. Depois, exiba os números digitados.
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();

        System.out.println("Digite 5 números: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o um número");
            int num = sc.nextInt();
            list.addNumbers(num);
        }

        list.displayNumbers();

        sc.close();
    }
}
