package Lista_Matriz_ForEach.Ex_2;
//Solicite 5 números ao usuário, armazene em uma lista e calcule a soma de todos os elementos.
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();

        System.out.println("Digite 5 números: ");

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            list.addNumbers(num);
        }

        list.displayNumbers();

        int sum = list.sumNumbers();
        System.out.println("A soma dos números digitados é "+sum);

    }
}
