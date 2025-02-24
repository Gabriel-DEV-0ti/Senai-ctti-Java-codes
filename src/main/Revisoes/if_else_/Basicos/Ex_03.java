package if_else_.Basicos;

import java.util.Scanner;

/*Receba dois números e exiba o maior deles.*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = sc.nextInt();
        System.out.println("Digite mais um número");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O número "+num1+" é o Maior");
        }else {
            System.out.println("O número "+num2+" é o Maior ");
        }
        sc.close();
    }
}
