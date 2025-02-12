package Ex_fixação;

import java.util.Scanner;

public class Objeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult (higher);
        sc.close();
    }
    public static  int max(int x, int y, int z){
        int abc;
        if (x > y && x > z){
            abc = x;
        } else if (y > z) {
            abc = y;
        }else {
            abc = z;
        }
        return abc;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
