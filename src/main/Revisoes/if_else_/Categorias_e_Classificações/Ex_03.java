package if_else_.Categorias_e_Classificações;

import java.util.Scanner;

/*Receba a altura de uma pessoa e determine se ela é considerada baixa,
média ou alta.*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura em metros");
        int altura = sc.nextInt();
        if (altura <= 159){
            System.out.println("Você é uma passoa estatura baixa");
        } else if (altura >= 160 && altura <= 180) {
            System.out.println("Você é uma pessoa de estatura média");
        } else {
            System.out.println("Você é uma pessoa de estatura alta");
        }
        sc.close();
    }
}
