package if_else_.Categorias_e_Classificações;

import java.util.Scanner;

/*Verifique se um número pertence à faixa de classificação A (1 a 10), B
(11 a 20) ou C (21 a 30).*/
public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu número?");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10){
            System.out.println("Seu número pertence a faixa de classificação A");
        } else if (num >= 11 && num <=20) {
            System.out.println("Seu número pertence a faixa de classificação B");
        }else if (num >= 21 && num <=30){
            System.out.println("Seu número pertence a faixa de classificação C");
        }else {
            System.out.println("Não possui classificação");
        }
        sc.close();
    }
}
