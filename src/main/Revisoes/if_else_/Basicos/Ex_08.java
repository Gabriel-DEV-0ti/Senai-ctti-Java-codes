package if_else_.Basicos;

import java.util.Scanner;

/*Receba um caractere e verifique se é uma vogal.*/
public class Ex_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um caracter");
        char vogal = sc.next().charAt(0);
        if (vogal == 'A'|| vogal == 'a'|| vogal == 'E' || vogal == 'e' || vogal == 'I' || vogal == 'i' || vogal == 'O' || vogal == 'o' || vogal == 'U' || vogal == 'u' ){
            System.out.println("O caracter é uma vogal");
        }else {
            System.out.println("O caracter é uma consoante");
        }
        sc.close();
    }
}
