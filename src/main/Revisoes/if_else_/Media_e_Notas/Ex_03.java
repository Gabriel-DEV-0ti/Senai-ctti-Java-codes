package if_else_.Media_e_Notas;

import java.util.Scanner;

/*Receba três notas e determine a maior e a menor nota.*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a seguda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();
        if (nota1 > nota2){
            System.out.println("A maior nota é: " + nota1);
        } else if (nota2 > nota3) {
            System.out.println("A maior nota é: " + nota2);
        }else {
            System.out.println("A maior nota é: " + nota3);
        }
        sc.close();
    }
}
