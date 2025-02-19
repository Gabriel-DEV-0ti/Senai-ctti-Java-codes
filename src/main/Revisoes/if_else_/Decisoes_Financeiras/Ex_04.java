package if_else_.Decisoes_Financeiras;

import java.util.Scanner;
/*Verifique se uma pessoa pode comprar um produto parcelado (parcelas <= 10% do salário).*/
public class Ex_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario");
        double salario = sc.nextDouble();
        double parcelas = (salario*10) /100;
        if (salario <= parcelas) {
            System.out.println("Voce pode pagar o produto parcelado");
        } else  {
            System.out.println("Voce nao pode pagar o produto parcelado");
        }
        sc.close();
    }
}

