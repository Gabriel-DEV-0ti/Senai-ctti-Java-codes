package main.Revisoes.Construtores.Ex_2;

import Construtores.Ex_2.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        
        Pessoa pessoa1 = new Pessoa("Gabriel de Souza Nunes", 22);
        Pessoa pessoa = new Pessoa();

        pessoa1.informacaoPessoa();
        pessoa.informacaoPessoa();

    }
}
