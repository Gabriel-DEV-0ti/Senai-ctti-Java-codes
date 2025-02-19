package ternaria;

import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();
        System.out.println("Você é estudante? true ou false");
        boolean estudante = sc.nextBoolean();

        String mensagem = qualificadoDesconto (age, estudante) ?
                "A pessoa está qualificada para o desconto;" :
                "A pessoa não esta qualificada para o desconto";
        System.out.println(mensagem);
        }
        public static boolean qualificadoDesconto (int age, boolean estudante){
        return age > 60 || estudante == true;
    }
}
