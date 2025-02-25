package Lista_Matriz_ForEach.Ex_3;
//Solicite 6 números ao usuário, armazene em uma lista e calcule a média dos valores.
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();

        System.out.println("Digite 6 números");

        for (int i = 1; i <= 6; i++){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            list.addNumbers(num);
        }

        list.displayNumbers();

        int average = list.averageNumbers();
        System.out.println("A média dos números somados é : " + average);
    }
}
