package MetodosClasses.Encapsulamento.Ex_2_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        double nota1;
        double nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        aluno.setNota1(nota1);
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        aluno.setNota2(nota2);

        double med = aluno.caucularMedia();

        aluno.setMedia(med);

        aluno.verificarAprovacao(med);

        sc.close();
    }
}
