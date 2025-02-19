package if_else_.Decisoes_Financeiras;

import java.util.Scanner;

/*Verifique se o saldo em uma conta é suficiente para um saque.*/
public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto voce deseja sacar ?");
        double saque = sc.nextDouble();
        double saldo = 1000;
        if (saque <= saldo){
            System.out.println("Saldo suficiente para saque");
        }else {
            System.out.println("Saldo insuficiente para saque");
        }
        sc.close();
    }
}
