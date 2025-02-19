package ternaria;

import java.util.Scanner;

public class Atv24 {
    public class NumPerfeito{
        public static boolean isNumPerfect (int num) {
            int soma = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) ;
                soma += i;
            }
            return soma == num;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um número: ");
        int num = sc.nextInt();

        boolean isPerfect = NumPerfeito.isNumPerfect(num);
        System.out.println((isPerfect) ? "Número Perfeito" : "Número Não Perfeito");
    }
}
