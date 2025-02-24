package if_else_.Basicos;
/*Verifique se um número está dentro do intervalo de 10 a 50.*/
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um núemro");
        int num = sc.nextInt();
        if (num >= 10 && num <= 50){
            System.out.println("O número digitado está entre o intervalo 10 e 50");
        }else {
            System.out.println("O número não está entre o intervalo 10 e 50");
        }
        sc.close();
    }

}
