package if_else_.Condições_com_Strings;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senhaDigitada = sc.nextLine();
        String senhaEsperada = "1234";
        if (senhaDigitada.equals(senhaEsperada)){
            System.out.println("A senha foi digitada corretamente");
        }else {
            System.out.println("Senha errada, digite novamente!");
        }
        sc.close();
    }
}
