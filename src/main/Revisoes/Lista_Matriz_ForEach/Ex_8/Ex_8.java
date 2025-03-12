package Lista_Matriz_ForEach.Ex_8;

import java.util.Scanner;

//Crie uma lista de 5 nomes digitados pelo usuário e depois exiba-os em ordem alfabética.
public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[5];

        for (int i = 0; i < list.length; i++){
            System.out.println("Digite um nome: ");
            list[i] = sc.nextLine();
        }
        for(int i = 0; i < list.length; i++) {
            for(int j = i+1; j < list.length; j++) {
                int k = 0;
                do{
                    if(list[i].charAt(k) == list[j].charAt(k)) {
                        if(k < list[i].length() - 1) {
                            k++;
                        }
                    }
                    if(list[i].charAt(k) > list[j].charAt(k)) {
                        String aux = list[j];
                        list[j] = list[i];
                        list[i] = aux;
                    }
                }while(list[i].charAt(k) == list[j].charAt(k)
                        && (k != list[i].length() - 1));
            }
        }

        System.out.println("Lista ordenada dos nomes inseridos: ");
        for(String i : list) {
            System.out.println(i + " ");
        }
    }
}
