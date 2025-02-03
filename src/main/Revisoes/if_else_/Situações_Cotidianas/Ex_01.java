package if_else_.Situações_Cotidianas;
/*Determine se um veículo pode passar em um pedágio (placa terminada
em número par ou ímpar).*/
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plate = "default";
        while(plate.length() != 8) {
            System.out.print("Insira a placa de carro (XXX-XXXX): ");
            plate = sc.nextLine();
            if(plate.length() != 8) {
                System.out.println("\nPlaca inválida!\n");
            }
        }
        if(Character.isAlphabetic(plate.charAt(7))) {
            System.out.println("Placa terminada em letra. Placa inválida!");
        }
        else if((Integer.parseInt(Character.toString(plate.charAt(7)))) % 2 == 0) {
            System.out.println("Placa terminada em par. Você pode passar no pedágio.");
        }
        else if((Integer.parseInt(Character.toString(plate.charAt(7)))) % 2 != 0) {
            System.out.println("Placa terminada em ímpar. Você não pode passar no pedágio.");
        }
        sc.close();
    }
}
