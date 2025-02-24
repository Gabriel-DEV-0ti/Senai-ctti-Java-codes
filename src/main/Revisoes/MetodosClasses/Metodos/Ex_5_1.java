package MetodosClasses.Metodos;

import java.util.Scanner;

//Determine a categoria de uma pessoa com base em sua idade: criança, adolescente, adulto ou idoso.
public class Ex_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        int date = max(idade);
        res (date);

        sc.close();
    }

    private static int max(int idade) {
        int age = idade;
        if (idade <= 12){
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 18) {
            System.out.println("Você é um adolecente");
        } else if (idade >= 19 && idade <=59) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
        return age;
    }

    private static void res(int date) {
        System.out.println(date);
    }
}
