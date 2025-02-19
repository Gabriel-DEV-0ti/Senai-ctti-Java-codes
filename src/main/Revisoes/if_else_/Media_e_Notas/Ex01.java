package if_else_.Media_e_Notas;

import java.util.Scanner;

/*Receba duas notas e informe se o aluno foi aprovado (média >= 7).*/
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Aluno aprovado! Media "+ media );
        } else {
            System.out.println("Aluno reprovado! Media "+ media);
        }
        sc.close();
    }
}
