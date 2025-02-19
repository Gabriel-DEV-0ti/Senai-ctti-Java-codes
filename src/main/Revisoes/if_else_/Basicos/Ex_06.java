package if_else_.Basicos;

import java.util.Scanner;

/*Determine se um ano é bissexto.*/
public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano");
        int ano = sc.nextInt();
        if (ano % 400 == 0 || ano % 4 == 0 || ano % 100 != 0){
            System.out.println("O ano digitado é um ano bissexto");
        } else {
            System.out.println("O ano digitado não é um ano bissexto");
        }
        sc.close();
    }
}
