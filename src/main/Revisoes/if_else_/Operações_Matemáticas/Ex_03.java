package if_else_.Operações_Matemáticas;

import java.util.Scanner;

/*Receba dois números e indique se um é divisível pelo outro.*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o primero número");
        int num1 = sc.nextInt();
        System.out.println("Indique o segundo número");
        int num2 = sc.nextInt();
        if (num2 % num1 == 0){
            System.out.println(num2 + " é divisível por " + num1);
        } else {
            System.out.println(num2 + " não é divisível por " + num1);
        }
        sc.close();
    }
}
