package if_else_.Basicos;

/*Verifique se um número é positivo ou negativo*/

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("O número digitado é positivo");
        } else {
            System.out.println("O número digitado é negativo");
        }
        sc.close();
    }
}
