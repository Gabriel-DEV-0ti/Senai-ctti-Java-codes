package MetodosClasses.Encapsulamento.Ex_3_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Senha senha = new Senha ();
        int senhaDigitada;
        System.out.println("Digite a senha:");
        senhaDigitada = sc.nextInt();
        senha.setSenhaDigitada(senhaDigitada);

        senha.verificacaoSenha();

        sc.close();
    }
}
