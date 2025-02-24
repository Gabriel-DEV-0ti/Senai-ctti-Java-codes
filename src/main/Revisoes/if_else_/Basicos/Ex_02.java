package if_else_.Basicos;

/*Determine se um número é par ou ímpar.*/

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um núemero");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        sc.close();
    }
}
