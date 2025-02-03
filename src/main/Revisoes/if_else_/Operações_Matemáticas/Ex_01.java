package if_else_.Operações_Matemáticas;

import java.util.Scanner;

/*Receba dois números e indique se sua soma é maior que 100.*/
public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Indique i segundo número");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        if (soma > 100) {
            System.out.println("O número " + soma + " é maior que 100");
        }else {
            System.out.println("O número " + soma + " não é maior que 100");
        }
        sc.close();
    }
}
