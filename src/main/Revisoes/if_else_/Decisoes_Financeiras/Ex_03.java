package if_else_.Decisoes_Financeiras;
/*Determine se uma pessoa pode financiar um imóvel (salário >=
R$3000).*/
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario");
        double salario = sc.nextDouble();
        double imovel = 3000.00;
        if ( salario >= 3000) {
            System.out.println("Voce pode financiar o imovel");
        } else  {
            System.out.println("Voce nao pode fianciar o imovel");
        }
        sc.close();
    }

}
