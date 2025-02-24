package ternaria;

import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner lados = new Scanner(System.in);
        System.out.println("Insira os lados do um triângulo: ");
        System.out.println("Lado 1 = ");
        System.out.println("Lado 2 = ");
        System.out.println("Lado 3 = ");
        int lado1 = lados.nextInt();
        int lado2 = lados.nextInt();
        int lado3 = lados.nextInt();

        System.out.println((lado1 == lado2 && lado1 == lado3) ? "Triângulo Equilátero" : (lado1 == lado2 || lado1 == lado3) ? "Triângulo Isósceles" : "Triângulo Escaleno");
    }
}
