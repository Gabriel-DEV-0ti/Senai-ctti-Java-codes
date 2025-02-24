package if_else_.Basicos;

import java.util.Scanner;

/*Verifique se um número é múltiplo de 5.*/
public class Ex_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = sc.nextInt();
        if (num % 5 == 0){
            System.out.println("O núemro é divisel por 5");
        }else {
            System.out.println("O número não é divisivel por 5");
        }
        sc.close();
    }
}
