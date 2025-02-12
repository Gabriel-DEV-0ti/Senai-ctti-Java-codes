package MetodosClasses.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as áreas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as áreas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle X area: " + areaY);

        Triangulo.areaTriangulo(areaX, areaY);

        sc.close();
    }


}
