package if_else_.Condições_com_Strings;
/*Receba uma palavra e verifique se ela contém mais de 5 caracteres.*/
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palavra");
        String p = sc.nextLine();
        if (p.length() > 5){
            System.out.println("A palavra contem mais de 5 caracteres ");
        }else {
            System.out.println("A palavra não contem mais de 5 caracteres");
        }
        sc.close();
    }
}

/*p.length() retorna o número de caracteres na palavra.*/
