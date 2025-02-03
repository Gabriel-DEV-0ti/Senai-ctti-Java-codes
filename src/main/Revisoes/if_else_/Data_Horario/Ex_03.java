package if_else_.Data_Horario;
/*Verifique se um dia do mês é válido para um mês específico (exemplo:
fevereiro).*/
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um mês: ");
        int month = sc.nextInt();
        System.out.print("Insira o dia: ");
        int day = sc.nextInt();
        System.out.print("O dia " + day);
        if (day > days[month - 1] || day < 1) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
        sc.close();
    }
}
