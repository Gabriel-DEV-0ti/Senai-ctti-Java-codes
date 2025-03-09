package MetodosClasses.Classes.Ex_5_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Idade idade = new Idade();

        System.out.println("Digite sua Idade:");
        idade.age = sc.nextInt();

        idade.comparandoIdade();

        sc.close();
    }
}
