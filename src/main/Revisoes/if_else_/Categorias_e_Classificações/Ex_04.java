package if_else_.Categorias_e_Classificações;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a pressão sistólica (em mmHg): ");
        int sistolica = sc.nextInt();
        System.out.println("Digite a pressão diastólica (em mmHg): ");
        int diastolica = sc.nextInt();
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Nível de risco: Normal");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Nível de risco: Moderado");
        } else if (sistolica >= 140 || diastolica >= 90) {
            System.out.println("Nível de risco: Alto");
        } else {
            System.out.println("Valores de pressão arterial inválidos.");
        }
        sc.close();
    }
}
