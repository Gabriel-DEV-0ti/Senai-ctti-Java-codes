package main.Revisoes.Metodos.Classes.Ex_2_1;
/*Receba duas notas e informe se o aluno foi aprovado (média >= 7).*/

import MetodosClasses.Classes.Ex_2_1.Aluno;

import java.util.Scanner;

/*Receba duas notas e informe se o aluno foi aprovado (média >= 7).*/
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite a primeira nota do aluno:");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        aluno.nota2 = sc.nextDouble();

        aluno.calcularMedia();
        aluno.verificarAprovacao(aluno.media);

    sc.close();
    }
}
