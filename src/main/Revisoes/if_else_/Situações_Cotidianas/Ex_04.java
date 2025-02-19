package if_else_.Situações_Cotidianas;
/*Determine se uma pessoa está apta para doar sangue (idade entre 18 e
65 anos e peso &gt;= 50 kg).*/
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        int age = sc.nextInt();
        System.out.print("Insira o peso: ");
        double weight = sc.nextDouble();
        System.out.print("A pessoa ");
        if(!(age >= 18 && age <= 65 && weight >= 50)) {
            System.out.print("não ");
        }
        System.out.print("está apta para doar sangue.");
        sc.close();
    }
}
