package if_else_.Media_e_Notas;

import java.util.Scanner;

/*Verifique se o aluno foi aprovado em duas disciplinas diferentes.*/
public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Media de Matematica");
        System.out.println("");
        System.out.println("Digite a primeira nota do aluno em Matematica");
        double nota1M = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2M = sc.nextDouble();
        double mediaM = (nota1M + nota2M) / 2;
        if (mediaM >= 7) {
            System.out.println("Aluno aprovado em Matematica! Media "+ mediaM );
        } else {
            System.out.println("Aluno reprovado em Matematica! Media "+ mediaM);
        }
        System.out.println("");
        System.out.println("Media de Portugues");
        System.out.println("");
        System.out.println("Digite a primeira nota do aluno em Portugues");
        double nota1P = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2P = sc.nextDouble();
        double mediaP = (nota1P + nota2P) / 2;
        if (mediaP >= 7) {
            System.out.println("Aluno aprovado em Portugues! Media "+ mediaP );
        } else {
            System.out.println("Aluno reprovado em Portugues! Media "+ mediaP);
        }
        sc.close();
    }
}
