package MetodosClasses.Encapsulamento.Ex_4_1;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Numeros numeros = new Numeros();
        int num1;
        int num2;

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();
        numeros.setNum1(num1);
        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        numeros.setNum1(num2);

        int sum = numeros.somaNum();

        numeros.menorMaior(sum);

        sc.close();
    }
}
