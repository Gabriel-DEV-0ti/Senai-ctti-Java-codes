package if_else_.Situações_Cotidianas;

import java.util.Scanner;
/*Crie um sistema simples de autenticação (usuário e senha).*/
public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("USUÁRIO: ");
        String user = sc.nextLine();
        System.out.print("SENHA: ");
        String password = sc.nextLine();
        if(user.equals("Admin")) {
            if(password.equals("9876")) {
                System.out.println("Seja bem vindo Administrador do Sistema.");
            }
            else {
                System.out.println("Senha incorreta.");
            }
        }
        else {
            System.out.println("Usuário não cadastrado.");
        }
        sc.close();
    }
}
