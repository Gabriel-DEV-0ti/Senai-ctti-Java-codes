package MetodosClasses.Encapsulamento.Ex_5_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Idade idade = new Idade();

        int age;
        System.out.println("Digite sua Idade:");
        age = sc.nextInt();
        idade.setAge(age);

        idade.comparandoIdade();

        sc.close();
    }
}
