package if_else_.Basicos;

import java.util.Scanner;

/*Receba um número e exiba se está entre 100 e 200 ou fora desse intervalo.*/
public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um núemro");
        int num = sc.nextInt();
        if (num >= 100 && num <= 200){
            System.out.println("O número digitado está entre o intervalo 100 e 200");
        }else {
            System.out.println("O número não está entre o intervalo 100 e 200");
        }
        sc.close();
    }
}
