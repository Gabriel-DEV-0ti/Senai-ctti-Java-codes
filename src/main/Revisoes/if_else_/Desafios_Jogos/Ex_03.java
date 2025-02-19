package if_else_.Desafios_Jogos;
/*Crie um jogo de adivinhação: o usuário insere um número e o programa
verifica se é igual ao número secreto.*/
import java.util.Random;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int drawn = rand.nextInt(5);
        System.out.print("Adivinhe o número secreto (0 a 5): ");
        int num = sc.nextInt();
        System.out.println("Número sorteado: " + drawn);
        if(drawn == num) {
            System.out.println("Parabéns! Você acertou.");
        }
        else {
            System.out.println("Sinto muito. Você errou.");
        }
        sc.close();
    }
}
