package if_else_.Data_Horario;
/*Determine se um mês digitado é válido.*/
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um mês: ");
        int month = sc.nextInt();
        System.out.print("O mês " + month);
        if(month > 12 || month < 1) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
        sc.close();
    }
}
