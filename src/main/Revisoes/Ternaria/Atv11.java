package ternaria;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma letra: ");
        String letter = sc.nextLine();

        switch (letter){
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case  "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
                break;
            case "A":
                System.out.println("Vogal");
                break;
            case "E":
                System.out.println("Vogal");
                break;
            case "I":
                System.out.println("Vogal");
                break;
            case  "O":
                System.out.println("Vogal");
                break;
            case "U":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }


    }
}
