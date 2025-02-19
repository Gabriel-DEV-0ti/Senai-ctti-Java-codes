package if_else_.Desafios_Jogos;
/*Receba dois números e determine se ambos são positivos ou negativos.*/
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        if(numA < 0 && numB < 0) {
            System.out.print("Ambos são negativos.");
        }
        else if(numA > 0 && numB > 0) {
            System.out.print("Ambos são positivos.");
        }
        else {
            System.out.print("Os números são opostos.");
        }
        sc.close();
    }
}
