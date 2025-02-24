package if_else_.Operações_Matemáticas;
/*Receba um número e indique se ele é um quadrado perfeito.*/
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        double raiz = Math.sqrt(num);
        if (raiz == (int) raiz){
            System.out.println("O número " + num + " é um quadrado perfeito.");
        } else {
            System.out.println("O número " + num + " não é um quadrado perfeito.");
        }
        sc.close();
    }
}
