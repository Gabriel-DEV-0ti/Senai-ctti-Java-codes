package if_else_.Basicos;

import java.util.Scanner;

/*Verifique se uma pessoa pode votar (idade mínima de 16 anos).*/
public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para sabermos se pode voltar");
        int idade = sc.nextInt();
        if (idade > 16) {
            System.out.println("Idade permitida para Votar");
        }else {
            System.out.println("Ainda não pode Votar com essa idade");
        }
        sc.close();
    }
}
