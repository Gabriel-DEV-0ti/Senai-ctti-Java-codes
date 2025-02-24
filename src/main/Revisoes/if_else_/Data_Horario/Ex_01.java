package if_else_.Data_Horario;
/*Verifique se um horário informado é válido (24 horas).*/
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um horário (HH:MM): ");
        String time = sc.nextLine();
        String[] hourMinute = time.split(":");
        int hours = Integer.parseInt(hourMinute[0]);
        int minutes = Integer.parseInt(hourMinute[1]);
        System.out.print("O horário " + time);
        if (hours > 23 || minutes > 59 || hours < 0 || minutes < 0) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
        sc.close();
    }
}
