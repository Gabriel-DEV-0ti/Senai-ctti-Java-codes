package if_else_.Desafios_Jogos;
/*Receba três números e exiba-os em ordem crescente.*/
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int numC = sc.nextInt();
        int higher = numA;
        int middle = numB;
        int lesser = numC;
        if(numA >= numB && numA >= numC) {
            if(numB < numC) {
                middle = numC;
                lesser = numB;
            }
        } else if (numB >= numA && numB >= numC) {
            higher = numB;
            if(numA < numC) {
                middle = numC;
                lesser = numA;
            } else {
                middle = numA;
            }
        }
        else{
            higher = numC;
            if(numA < numB) {
                lesser = numA;
            }
            else{
                middle = numA;
                lesser = numB;
            }
        }
        System.out.print("Ordem crescente: ");
        System.out.print(lesser + ", " + middle + ", " + higher);
    }
}
