package main.Revisoes.GetAndSet.Ex_2;

import GetAndSet.Ex_2.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("CADASTRO DE CONTA BANCÁRIA");
        System.out.print("Titular da conta: ");
        conta.setTitular(sc.nextLine());
        System.out.print("Saldo da conta: ");
        conta.setSaldo(sc.nextDouble());
        System.out.println("\nConta criada com sucesso!");
        int escolha = 0;
        conta.menu(escolha);
        sc.close();
    }
}
