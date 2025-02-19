package ternaria;

import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma senha: ");
        String senha = sc.nextLine();
        int numCaracteres = senha.length();

        System.out.println((numCaracteres >= 8) ? "Senha Válida" : "Senha Inválida");

    }
}
