package if_else_.Data_Horario;
/*Verifique se uma data está dentro de um período específico.*/
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dd_mm_aa;
        boolean valid = false;

        System.out.print("Insira a data de início do período (DD/MM/AA): ");
        String start = sc.nextLine();
        dd_mm_aa = start.split("/");
        int dayStart = Integer.parseInt(dd_mm_aa[0]);
        int monthStart = Integer.parseInt(dd_mm_aa[1]);
        int yearStart = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("Insira a data de fim do período (DD/MM/AA): ");
        String end = sc.nextLine();
        dd_mm_aa = end.split("/");
        int dayEnd = Integer.parseInt(dd_mm_aa[0]);
        int monthEnd = Integer.parseInt(dd_mm_aa[1]);
        int yearEnd = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("Insira a data de checagem (DD/MM/AA): ");
        String check = sc.nextLine();
        dd_mm_aa = check.split("/");
        int dayCheck = Integer.parseInt(dd_mm_aa[0]);
        int monthCheck = Integer.parseInt(dd_mm_aa[1]);
        int yearCheck = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("A data ");
        if (yearCheck >= yearStart && yearCheck <= yearEnd) {
            if (monthCheck >= monthStart && monthCheck <= monthEnd) {
                if (monthCheck == monthStart && dayCheck >= dayStart) {
                    valid = true;
                }
                if (monthCheck == monthEnd && dayCheck <= dayEnd) {
                    valid = true;
                } else {
                    valid = false;
                }
                if (monthCheck != monthStart && monthCheck != monthEnd) {
                    valid = true;
                }
            }
        }
        if(!valid) {
            System.out.print("não ");
        }
        System.out.print("está no período inserido.");
        sc.close();
    }
}
