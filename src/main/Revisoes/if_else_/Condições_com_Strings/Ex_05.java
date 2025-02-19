package if_else_.Condições_com_Strings;

import java.util.Scanner;

/*Receba um número e indique se ele é um quadrado perfeito.*/
public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        double raizQuadrada = Math.sqrt(num);
        if (raizQuadrada == (int) raizQuadrada){
            System.out.println("O número é um quadrado perfeito");
        }else {
            System.out.println("O número não é um quadrado perfeito");
        }
        sc.close();
    }
}
/*Math.sqrt(numero) calcula a raiz quadrada do número.
Verificamos se a raiz quadrada é um número inteiro. Para isso, comparamos raizQuadrada com seu valor inteiro usando (int) raizQuadrada.*/