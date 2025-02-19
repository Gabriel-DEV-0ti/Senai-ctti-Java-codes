package Ex_fixação.ObjClas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Neste processo de uso dos objetos nos criamos aqui um objeto do tipo Triangulo fazendo com que seja muito
        melhor representado o triangulo evitando que seja necessario a criacao de varios tipos de variaveis para
        representa-lo, pois antes era necessario inserir uma variavel para cada valor agora vc insere os tres valores
        dentro de uma variavel que recebeu os tres valores digitados.
         */
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle x: ");
        y.c = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle X area: " + areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }
        sc.close();


        sc.close();
    }
}

