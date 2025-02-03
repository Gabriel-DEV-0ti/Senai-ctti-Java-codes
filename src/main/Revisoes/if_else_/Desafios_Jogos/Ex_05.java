package if_else_.Desafios_Jogos;
/*Determine se o usuário acertou um número entre 1 e 10 sorteado pelo
programa.*/
import java.util.Random;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int drawn = rand.nextInt(10);
        System.out.print("Adivinhe o número de 0 a 10: ");
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
