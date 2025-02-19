package if_else_.Condições_com_Strings;

import java.util.Scanner;

/*Verifique se uma palavra recebida é &quot;Sim&quot; ou &quot;Não&quot;.*/
public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Sim ou Não");
        String p = sc.nextLine().toLowerCase();
        if (p.equals("sim")){
            System.out.println("A palavra difitada foi " + p);
        } else if (p.equals("não")) {
            System.out.println("A palavra digitada foi " + p);
        } else {
            System.out.println("Palavra inválida. Digite 'sim' ou 'não'.");
        }
        sc.close();
    }
}
