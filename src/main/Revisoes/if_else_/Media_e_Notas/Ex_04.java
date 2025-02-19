package if_else_.Media_e_Notas;

import java.util.Scanner;

/*Verifique se o aluno foi aprovado e recebeu nota máxima em uma
disciplina (nota >= 10).*/
public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 10 && media <= 10) {
            System.out.println("Aluno aprovado e rescebeu a maior nota! A media é: "+ media );
        } else if (media >= 7 && media <= 9 ) {
            System.out.println("Aluno aprovado! Media: "+ media );
        } else {
            System.out.println("Aluno reprovado e ficou na recuperação! Media "+ media);
        }
        sc.close();
    }
}
