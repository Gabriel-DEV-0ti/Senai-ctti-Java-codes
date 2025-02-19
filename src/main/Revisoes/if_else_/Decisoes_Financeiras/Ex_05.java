package if_else_.Decisoes_Financeiras;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra do cliente");
        double valor = sc.nextDouble();
        double valorm = 360.00;
        if (valor >= valorm && valor < 4000) {
            double desconto = (valor*30) /100;
            double total = valor-desconto;
            System.out.println("Cliente recebe 30% de desconto");
            System.out.println("Valor total: R$" +total );
            System.out.println("Valor descontado: R$" +desconto );

        } else  {
            System.out.println("Cliente nao recebera nenhum desconto");
        }
        sc.close();
    }

}
