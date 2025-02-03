package if_else_.Media_e_Notas;

import java.util.Scanner;

/*Verifique se o aluno foi aprovado, em recuperação (média &gt;= 5 e &lt; 7) ou
reprovado.*/
public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5 && media <= 7) {
            System.out.println("Aluno aprovado em recuperação! Media "+ media );
        } else {
            System.out.println("Aluno reprovado em recuperação! Media "+ media);
        }
        sc.close();
    }
}
