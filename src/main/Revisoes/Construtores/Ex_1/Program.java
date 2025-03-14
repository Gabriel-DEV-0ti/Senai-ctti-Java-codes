package Construtores.Ex_1;

import Construtores.Ex_1.Carro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca;
        int ano;

        System.out.println("Digite a marca do carro: ");
        marca = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        ano = sc.nextInt();

        Carro carro = new Carro (marca, ano);

        carro.informacoesCarro();

    }
}
