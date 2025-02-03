package if_else_.Basicos;

import java.util.Scanner;

/*Receba três números e mostre o maior deles.*/
public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = sc.nextInt();
        System.out.println("Digite mais um número");
        int num2 = sc.nextInt();
        System.out.println("Digite mais um número");
        int num3 = sc.nextInt();
        if (num1 > num2){
            System.out.println("O número "+num1+" é o Maior");
        } else if (num2 > num3) {
            System.out.println("O número "+num2+" é o Maior");
        } else {
            System.out.println("O número "+num3+" é o Maior");
        }
        sc.close();
    }
}
