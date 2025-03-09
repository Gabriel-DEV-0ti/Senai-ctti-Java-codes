package MetodosClasses.Classes.Ex_4_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Numeros numeros = new Numeros();

        System.out.println("Digite o primeiro número:");
        numeros.num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        numeros.num2 = sc.nextInt();

        numeros.somaNum();

        sc.close();
    }
}
