package MetodosClasses.Metodos;

import java.util.Scanner;

/*Receba duas notas e informe se o aluno foi aprovado (média >= 7).*/

public class Ex_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do auluno");
        double nota2 = sc.nextDouble();

        double notas = med (nota1, nota2);
        res (notas);
        sc.close();
    }

    private static double med(double nota1, double nota2) {
        double medNotas;
        medNotas = (nota1 + nota2) / 2;
        return medNotas;
    }

    private static void res(double notas) {
        System.out.println("a média das notas é: " + notas);
    }

}