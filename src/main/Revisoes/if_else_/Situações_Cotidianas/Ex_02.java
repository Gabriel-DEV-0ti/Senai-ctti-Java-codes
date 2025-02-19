package if_else_.Situações_Cotidianas;
/*Verifique se um número corresponde a um código de acesso.*/
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código de acesso: ");
        int code = sc.nextInt();
        System.out.print("O código de acesso está ");
        if (code != 1111) {
            System.out.print("IN");
        }
        System.out.print("CORRETO.");
        sc.close();
    }
}
