package if_else_.Operações_Matemáticas;

import java.util.Scanner;

/*Verifique se a diferença entre dois números é negativa.*/
public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o primero número");
        int num1 = sc.nextInt();
        System.out.println("Indique o segundo número");
        int num2 = sc.nextInt();
        int sub = num1 - num2;
        if (sub < 0){
            System.out.println("A diferença dos números é negativa");
        }else {
            System.out.println("A diferença não é negativa");
        }
        sc.close();
    }
}
