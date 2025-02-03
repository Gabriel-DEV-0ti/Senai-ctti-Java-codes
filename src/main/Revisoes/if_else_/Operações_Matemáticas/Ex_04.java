package if_else_.Operações_Matemáticas;

import java.util.Scanner;

/*Receba três números e verifique se eles podem formar um triângulo.*/
public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o segundo lado do triangulo");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo");
        double lado3 = sc.nextDouble();
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2){
            System.out.println("Os lado formam um triangulo");
        }else {
            System.out.println("Os lados não formam um triangulo ");
        }
        sc.close();
    }
}
