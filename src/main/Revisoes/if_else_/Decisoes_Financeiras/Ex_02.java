package if_else_.Decisoes_Financeiras;

import java.util.Scanner;

/*Calcule o desconto em uma compra, baseado no valor total (&gt; R$500
recebe 10%).*/
public class Ex_02 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto: (Caso seja maior que 500 voce ira recebr um desconto de 10% do valor total");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        if (valor<500) {
            System.out.println("O valor da compra é de : R$" +valor);
        }else if (valor >= 500) {
            double desconto = (valor*10) /100;
            double valor2 = valor - desconto;
            System.out.println("Valor total da compra : R$" + valor2);
            System.out.println("Valor do desconto: R$" +desconto );
        }
        sc.close();
    }
}
