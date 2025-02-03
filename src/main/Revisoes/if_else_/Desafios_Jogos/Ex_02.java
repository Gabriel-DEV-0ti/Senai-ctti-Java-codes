package if_else_.Desafios_Jogos;
/*Verifique se um número é maior que o dobro de outro.*/
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        if(numA == numB * 2) {
            System.out.print(numA + " é o dobro de " + numB);
        }
        else if(numB == numA * 2) {
            System.out.print(numB + " é o dobro de " + numA);
        }
        else {
            System.out.print("Não há dobro.");
        }
        sc.close();
    }
}
