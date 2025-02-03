package if_else_.Data_Horario;
/*Determine se um horário está no período da manhã, tarde ou noite.*/
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um horário (HH:MM): ");
        String time = sc.nextLine();
        String[] hourMinute = time.split(":");
        int hours = Integer.parseInt(hourMinute[0]);
        System.out.print("Período: ");
        if (hours < 6) {
            System.out.print("Madrugada");
        } else if (hours < 12) {
            System.out.print("Manhã");
        } else if (hours < 18) {
            System.out.print("Tarde");
        } else {
            System.out.print("Noite");
        }
        sc.close();
    }
}
