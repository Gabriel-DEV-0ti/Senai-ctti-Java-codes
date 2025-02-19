package MetodosClasses;

import java.util.Scanner;

//Receba dois números e indique se sua soma é maior que 100.
public class Ex_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique dois números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = soma(num1, num2);
        res(result);
    }

    private static int soma(int num1, int num2) {
        int somaNum = num1 + num2;

        if (somaNum > 100){
            System.out.println("O número " + somaNum + " é maior que 100");
        }else {
            System.out.println("O número " + somaNum + " não é maior que 100");
        }
        return somaNum;
    }

    public static void res(int result){
        System.out.println(result);
    }

}
