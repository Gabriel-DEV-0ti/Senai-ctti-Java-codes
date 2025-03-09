package MetodosClasses.Classes.Ex_3_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Senha senha = new Senha ();

        System.out.println("Digite a senha:");
        senha.senhaDigitada = sc.nextInt();

        senha.verificacaoSenha();

        sc.close();
    }
}
