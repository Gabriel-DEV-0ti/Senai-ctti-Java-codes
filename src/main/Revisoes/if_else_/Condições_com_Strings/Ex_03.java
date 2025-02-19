package if_else_.Condições_com_Strings;

import java.util.Scanner;

/*Verifique se um nome digitado começa com a letra &quot;A&quot;.*/
public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu Nome");
        String nome = sc.nextLine();
        String letra = "A";
        if (nome.toUpperCase().startsWith(String.valueOf(letra).toUpperCase())){
            System.out.println("O nome começa com a letra: " + letra);
        }else {
            System.out.println("O nome não começa com a letra: " + letra);
        }
        sc.close();
    }
}
/*startsWith() verifica se o nome começa com o prefixo dado.
O uso de toUpperCase() é para garantir que a verificação seja feita de forma insensível a maiúsculas e minúsculas.
String.valueOf(letra) converte o caractere em uma string.*/
