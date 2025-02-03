package if_else_.Situações_Cotidianas;

import java.util.Scanner;
/*Receba uma temperatura em graus Celsius e converta para Fahrenheit
ou Kelvin (baseado na escolha do usuário).*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Graus Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("\nEscolha a conversão: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin");
        int option = sc.nextInt();
        if (option == 1) {
            double fanrenheit = (celsius * 1.8) + 32;
            System.out.println("Graus Fahrenheit: " + fanrenheit);
        }
        else if(option == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Kelvin: " + kelvin);
        }
        else {
            System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
